import java.util.*;

class DiameterOfTree{

	private static int diameterOfTree(int n,Vector<Vector<Integer> > edges)
	{
          ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

          for(int i=0; i<n; i++){
               adj.add(new ArrayList<Integer>());
          }

          for(int i=0; i<edges.size(); i++){
               int u = (int) ( edges.get(i).get(0));
               int v = (int) ( edges.get(i).get(1));
               adj.get(u-1).add(v-1);
               adj.get(v-1).add(u-1);
          } 
          Queue<Integer> q = new LinkedList<>();

          q.add(0);

          boolean [] visited = new boolean [n];

          int farthest = -1;

          // finding farthest point
          while(q.size() > 0){
               int node = q.remove();
               farthest = node;
               visited[node] = true;

               for(int nbr: adj.get(node)){
                    if(!visited[nbr])
                    q.add(nbr);
               }
          }

          Arrays.fill(visited, false);

          q.add(farthest);

          int [] distance = new int [n];
          int maxDistance = 0;
          distance[farthest] = 0;

          // finding farthest node from the node which we got earlier
          while(q.size() > 0){
               int node = q.remove();
               visited[node] = true;

               for(int nbr: adj.get(node)){
                    if(!visited[nbr]){
                         q.add(nbr);
                         distance[nbr] = distance[node] + 1;
                         maxDistance = Math.max(maxDistance, distance[nbr]);
                    }
               }
          }
          return maxDistance;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		for(int test=0;test<t;test++)
		{
			int n=sc.nextInt();
			int m=sc.nextInt();
			Vector<Vector<Integer> > edges = new Vector<Vector<Integer> >();
			for(int i=0;i<m;i++)
			{
				int u=sc.nextInt();
				int v=sc.nextInt();
				Vector<Integer> edge = new Vector<Integer>();
				edge.add(u);
				edge.add(v);
				edges.add(edge);
			}
               if(m==1){
                    System.out.println(1);
               }
			else{
                    System.out.println(diameterOfTree(n,edges));
               }
		}
	}
}
