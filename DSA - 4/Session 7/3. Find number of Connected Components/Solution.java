import java.util.*;

public class ConnectedComponentsInGraph {

    int connectedComponentsInGraph(int n,  ArrayList<ArrayList<Integer>> edges) {
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

        System.out.println(adj);

        ArrayList<ArrayList<Integer>> comps = new ArrayList<>();

        for(int i=1; i<=n;i++){
            if(!visited[i]){
                ArrayList<Integer> comp = new ArrayList<Integer>(); 
                connectedComponents(visited, n, adj, i, comp);
                comps.add(comp);
            }
        }
        System.out.println(comps);
        return comps.size();
    }

    public void connectedComponents(boolean [] visited, int V, ArrayList<ArrayList<Integer>> adj, int node, ArrayList<Integer> comp){
        
        visited[node] = true;
        // System.out.println(node);
        comp.add(node);

        for(int nbr: adj.get(node)){
            // if(nbr == node) comp.add(nbr);
            if(!visited[nbr]) {
                connectedComponents(visited, V, adj, nbr, comp);
            }
        }
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<ArrayList<Integer>> edges = new ArrayList<ArrayList<Integer>>();
    
        for(int i = 0;i < m; i++) {
            edges.add(new ArrayList<Integer>());
            edges.get(i).add(scanner.nextInt());
            edges.get(i).add(scanner.nextInt());
        }
        ConnectedComponentsInGraph answer = new ConnectedComponentsInGraph();
        int result = answer.connectedComponentsInGraph(n, edges);
        System.out.println(result);
        scanner.close();
    }
}
