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

"""
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
"""
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
