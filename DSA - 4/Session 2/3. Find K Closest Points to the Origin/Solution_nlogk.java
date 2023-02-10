import java.util.*;

class Pair implements Comparable<Pair> {
    long distance;
    int x;
    int y;

    public Pair(long distance, int x, int y) {
        this.distance = distance;
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Pair o) {
        return distance > o.distance ? 1 : -1;
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

    public static ArrayList<ArrayList<Integer>> kClosestPointsToOrigin(ArrayList<ArrayList<Integer>> points, int k){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        int mod = 1000000007;
        for(int i=0; i<points.size(); i++){
            long x = points.get(i).get(0);
            long y = points.get(i).get(1);
            long distance = (x * x +  y*y);
            pq.add(new Pair(distance, points.get(i).get(0), points.get(i).get(1)));
            if(pq.size() > k) pq.poll();
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

/*
static class Pair {
        
        double dist;
        int idx;

        public Pair(double dist, int idx) {
            this.dist = dist;
            this.idx = idx;
        }
    }

static ArrayList<ArrayList<Integer>> kClosestPointsToOrigin(ArrayList<ArrayList<Integer>> points, int k){

        ArrayList<ArrayList<Integer>> closetPoints = new ArrayList<>();

        PriorityQueue<Pair> maxHeap = new PriorityQueue<>((a, b) -> Double.compare(b.dist, a.dist) );

        int i = 0;
        for (ArrayList<Integer> point: points) {
            
            double dist = Math.sqrt((point.get(0)*point.get(0)) + (point.get(1)*point.get(1)));
            maxHeap.offer(new Pair(dist, i++));

            if (maxHeap.size() > k)
                maxHeap.poll();
        }

        while (maxHeap.size() != 0) {
            Pair curr = maxHeap.poll();
            ArrayList<Integer> point = points.get(curr.idx);
            closetPoints.add(point);
        }

        return closetPoints;
    }
*/
