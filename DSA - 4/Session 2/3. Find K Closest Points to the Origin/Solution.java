// Time  : O(nlogn)
// Space : O(n)

import java.util.*;

class Pair implements Comparable<Pair> {
    int distance;
    int x;
    int y;

    public Pair(int distance, int x, int y) {
        this.distance = distance;
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Pair o) {
        return distance - o.distance;
    }
}

class KClosestPointsToOrigin{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<ArrayList<Integer>> points = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> point = new ArrayList<>();
            point.add(sc.nextInt());
            point.add(sc.nextInt());
            points.add(point);
        }
        ArrayList<ArrayList<Integer>> ans = kClosestPointsToOrigin(points, k);
        for (ArrayList<Integer> point: ans) {
            System.out.println(point.get(0) + " " + point.get(1));
        }
    }

    static ArrayList<ArrayList<Integer>> kClosestPointsToOrigin(ArrayList<ArrayList<Integer>> points, int k){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int mod = 1000000007;
        for(int i=0; i<points.size(); i++){
            // long x = points.get(i).get(0) * points.get(i).get(0);
            // long y = points.get(i).get(1)*points.get(i).get(1)) % mod;
            int distance = (points.get(i).get(0) * points.get(i).get(0) +  points.get(i).get(1)*points.get(i).get(1)) % mod;
            pq.add(new Pair(distance, points.get(i).get(0), points.get(i).get(1)));
        }

        while(k>0){
            ArrayList<Integer> p = new ArrayList<>();
            Pair point = pq.poll();
            
            p.add(point.x);
            p.add(point.y);
            ans.add(p);
            k--;
        }
        return ans;
    }
}
