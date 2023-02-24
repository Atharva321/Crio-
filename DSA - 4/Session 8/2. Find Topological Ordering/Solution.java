import java.util.*;

class TopologicalOrdering{
	private static Vector<Integer> topologicalOrdering(int n,Vector<Vector<Integer>> edges)
	{
          // Vector<Vector<Integer>> adj = new Vector<Vector<Integer>>(n);
          ArrayList<ArrayList<Integer>> adj = new ArrayList<>(n);
          for(int i=0; i<n; i++){
               adj.add(new ArrayList<Integer>());
          }

           for(int i=0; i<edges.size(); i++){
               int u = (int) ((Vector) edges.get(i)).get(0);
               int v = (int) ((Vector) edges.get(i)).get(1);
               adj.get(u-1).add(v-1);
          }
          int [] inDegree = new int [n];
          Arrays.fill(inDegree, 0);
          
          for(int node=0; node<n; node++){
               for(int nbr: adj.get(node)){
                    inDegree[nbr]++;
               }
          }

          Vector<Integer> topSort = new Vector<Integer>();

          Queue<Integer> q = new LinkedList<>();
          for(int i=0; i<n; i++){
               if(inDegree[i]==0){ 
                    q.add(i);
                    topSort.add(i+1);
               }
          }

          while(!q.isEmpty()){
               int node = q.peek();
               q.remove();

               for(int nbr: adj.get(node)){
                    inDegree[nbr]--;
                    if(inDegree[nbr] == 0){
                         q.add(nbr);
                         topSort.add(nbr+1);
                    }
               }
          }

          return topSort;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int e = sc.nextInt();
		Vector<Vector<Integer> > edges = new Vector<Vector<Integer> >();
		for(int i=0;i<e;i++)
		{
			int u=sc.nextInt();
			int v=sc.nextInt();
			Vector<Integer> edge = new Vector<Integer>();
			edge.add(u);
			edge.add(v);
			edges.add(edge);
		}
		Vector<Integer> answer = topologicalOrdering(n,edges);

		for(int elem : answer)
			System.out.print(elem+" ");
	}
}
