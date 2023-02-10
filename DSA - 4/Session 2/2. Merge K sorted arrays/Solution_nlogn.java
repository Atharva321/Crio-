import java.util.*;

class Pair implements Comparable<Pair> {
    int num;
    int arrIndex;
    int index;

    public Pair(int num, int arrIndex, int index) {
        this.num = num;
        this.arrIndex = arrIndex;
        this.index = index;
    }

    @Override
    public int compareTo(Pair o) {
        return num - o.num;
    }
}

class MergeKSortedArrays{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        ArrayList<ArrayList<Integer>> arrays = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < k; i++) {
            int n = sc.nextInt();
            ArrayList<Integer> array = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                array.add(sc.nextInt());
            }
            arrays.add(array);
        }
        ArrayList<Integer> ans = mergeKSortedArrays(arrays);
        for (Integer x: ans) {
            System.out.print(x + " ");
        }
    }

    static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> arrays){
        ArrayList<Integer> ans = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(ArrayList<Integer> arr: arrays){
            for(int i=0; i<arr.size(); i++){
                pq.add(arr.get(i));

            }
        }

        while(pq.size() > 0){
            ans.add(pq.poll());
        }

        return ans;
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
