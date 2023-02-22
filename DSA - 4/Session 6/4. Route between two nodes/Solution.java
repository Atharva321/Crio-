import java.util.*;

public class RouteBetweenNodes {
    // Implement Solution Here
    boolean routeBetweenNodes(int source , int destination ,int n,  ArrayList<ArrayList<Integer>> edges) {
        boolean [] visited = new boolean [n+1];
        
        //First create Adjacency List
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(n+1);
        
        for(int i=0; i<=n;i++){
            adj.add(new ArrayList<Integer>());
        }

        // adding connections
        for(int i=0; i<edges.size(); i++){
            adj.get(edges.get(i).get(0)).add(edges.get(i).get(1));
        }

        return printAllPaths(visited, n, adj, source, destination);
    }

    public boolean printAllPaths(boolean [] visited, int V, ArrayList<ArrayList<Integer>> adj, int src, int destn){
        
        visited[src] = true;

        for(int nbr: adj.get(src)){
            
            if(nbr == destn){
                return true;
            }

            if(visited[nbr] != true) 
                if(printAllPaths(visited, V, adj, nbr, destn)) return true;
        }

        return false;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int p = 0 ; p < t ; p++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            ArrayList<ArrayList<Integer>> edges = new ArrayList<ArrayList<Integer>>();
        
            for(int i=0;i<m;i++){
                edges.add(new ArrayList<Integer>());
                edges.get(i).add(scanner.nextInt());
                edges.get(i).add(scanner.nextInt());
            }
            int src = scanner.nextInt();
            int dest = scanner.nextInt();
            RouteBetweenNodes answer = new RouteBetweenNodes();
            boolean result = answer.routeBetweenNodes(src, dest,n,edges);
            if (result) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        scanner.close();
    }
}

/* 
  Crio Methodology
  
  Milestone 1: Understand the problem clearly
  1. Ask questions & clarify the problem statement clearly.
  2. *Type down* an example or two to confirm your understanding of the input/output & extend it to test cases
  2
2 2
1 2
2 1
1 1
2 1
1 2
1 1

  Milestone 2: Finalize approach & execution plan
  1. Understand what type of problem you are solving.
       a. Obvious logic, tests ability to convert logic to code
       b. Figuring out logic
       c. Knowledge of specific domain or concepts
       d. Knowledge of specific algorithm
       e. Mapping real world into abstract concepts/data structures
  2. Brainstorm multiple ways to solve the problem and pick one
  3. Get to a point where you can explain your approach to a 10 year old
  4. Take a stab at the high-level logic & *type it down*.
  5. Try to offload processing to functions & keeping your main code small.
  
  Milestone 3: Code by expanding your pseudocode
  1. Have frequent runs of your code, dont wait for the end
  2. Make sure you name the variables, functions clearly.
  3. Avoid constants in your code unless necessary; go for generic functions, you can use examples for your thinking though.
  4. Use libraries as much as possible
  
  Milestone 4: Prove to the interviewer that your code works with unit tests
  1. Make sure you check boundary conditions
  2. Time & storage complexity
  3. Suggest optimizations if applicable
  */
