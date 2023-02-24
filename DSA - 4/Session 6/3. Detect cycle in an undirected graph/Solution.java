import java.util.*;
import java.io.*;

class DetectCycle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		while ((t--) > 0) {
			int nodes = sc.nextInt();
			int e = sc.nextInt();
			ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
			for (int i = 0; i < e; i++) {
				ArrayList<Integer> b = new ArrayList<Integer>();
				b.add(sc.nextInt());
				b.add(sc.nextInt());
				edges.add(b);
			}
			String ans = DetectCycle.detectCycle(nodes, edges);
			System.out.println(ans);
		}
		sc.close();
	}

	// Implement your Solution Here
	public static String detectCycle(int nodes, ArrayList<ArrayList<Integer>> edges) {
          boolean [] visited = new boolean [nodes + 1];
          ArrayList<ArrayList<Integer>> adj = new ArrayList<>(nodes+1);

          for(int i=0; i<=nodes;i++){
               adj.add(new ArrayList<Integer>());
          }
          for(int i=0; i<edges.size(); i++){
               adj.get(edges.get(i).get(0)).add(edges.get(i).get(1));
          }

          // String isCycle = "No";
          // for(int i=1; i<=nodes; i++){
          //      if(cycleDetector(visited, nodes, adj, i, -1).equals("Yes")) return "Yes";
          // }

          // boolean visited[] = new boolean[V];
          for(int i=1;i<=nodes;i++){
               if(visited[i]) continue;
               Queue<Integer> q=new LinkedList<>();
               q.add(i);
               while(!q.isEmpty()){
                    int curr = q.remove();
                    if(visited[curr]) return "Yes";
                    visited[curr]=true;
                    for(int nbr : adj.get(curr)){
                         if(!visited[nbr]) q.add(nbr);
                    }
               }
          }
          return "No";
	}

     public static String cycleDetector(boolean[] visited, int nodes, ArrayList<ArrayList<Integer>> adj, int src, int parent){
          visited[src] = true;

          for(int nbr: adj.get(src)){
               if(!visited[nbr]){
                    if(cycleDetector(visited, nodes, adj, nbr, src).equals("Yes")) return "Yes";
               }
               else if(parent != nbr) return "Yes";
          }

          // visited[src] = false;
          return "No";
     }
}

/* 
  Crio Methodology
  
  Milestone 1: Understand the problem clearly
  1. Ask questions & clarify the problem statement clearly.
  2. *Type down* an example or two to confirm your understanding of the input/output & extend it to test cases
  
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
