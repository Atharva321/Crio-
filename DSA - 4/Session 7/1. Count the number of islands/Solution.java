import java.io.*;
import java.util.*;

class NumberOfIslands {


    public int numIslands(char[][] grid) {
        int ans = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] vis = new int[rows][cols];
        for (int i=0;i<grid.length;i++) {
            for (int j=0;j<grid[0].length;j++) {
                vis[i][j] = 0;
            }
        }
        for (int i=0;i<grid.length;i++) {
            for (int j=0;j<grid[0].length;j++) {
                if (grid[i][j] == '1' && vis[i][j] != 1) {
                    ans++;
                    markVisited(i, j, vis, grid);
                }
            }
        }
        return ans;
    }
    
    public void markVisited(int i, int j, int[][] vis, char[][] grid) {
        int x = i;
        int y = j;
        if (x<0 || x>grid.length-1 || y<0 || y>grid[0].length-1 || grid[x][y]=='0' || vis[x][y]==1) {
            return;
        }
        vis[x][y] = 1;
        if (grid[x][y] == '1') {
            markVisited(x, y-1, vis, grid);
            markVisited(x, y+1, vis, grid);
            markVisited(x-1, y, vis, grid);
            markVisited(x+1, y, vis, grid);
        }
    }

//     int connectedComponentsInGraph(int n,  ArrayList<ArrayList<Integer>> edges) {
//         boolean [] visited = new boolean [n+1];
        
//         //First create Adjacency List
//         ArrayList<ArrayList<Integer>> adj = new ArrayList<>(n+1);
        
//         for(int i=0; i<=n;i++){
//             adj.add(new ArrayList<Integer>());
//         }

//         // adding connections
//         for(int i=0; i<edges.size(); i++){
//             adj.get(edges.get(i).get(0)).add(edges.get(i).get(1));
//             adj.get(edges.get(i).get(1)).add(edges.get(i).get(0));
//         }

//         // System.out.println(adj);

//         ArrayList<ArrayList<Integer>> comps = new ArrayList<>();

//         for(int i=1; i<=n;i++){
//             if(!visited[i]){
//                 ArrayList<Integer> comp = new ArrayList<Integer>(); 
//                 connectedComponents(visited, n, adj, i, comp);
//                 comps.add(comp);
//             }
//         }
//         // System.out.println(comps);
//         return comps.size();
//     }

//     public void connectedComponents(boolean [] visited, int V, ArrayList<ArrayList<Integer>> adj, int node, ArrayList<Integer> comp){
        
//         visited[node] = true;
//         // System.out.println(node);
//         comp.add(node);

//         for(int nbr: adj.get(node)){
//             // if(nbr == node) comp.add(nbr);
//             if(!visited[nbr]) {
//                 connectedComponents(visited, V, adj, nbr, comp);
//             }
//         }
        
//     }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int columns = in.nextInt();
        char[][] grid = new char[rows][columns];

        for(int i = 0 ; i < rows ; ++i) {
            String s = in.next();
            for(int j = 0 ; j < columns ; ++j) {
                grid[i][j] = s.charAt(j);
            }
        }
        in.close();
        int result = new NumberOfIslands().numIslands(grid);
        System.out.println(result);
    }
}
