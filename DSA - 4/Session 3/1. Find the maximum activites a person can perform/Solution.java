import java.util.*;

// class Pair implements Comparable<Pair> {
//     int start;
//     int end;

//     public Pair(int start, int end) {
//         this.start = start;
//         this.end = end;
//     }

//     @Override
//     public int compareTo(Pair o) {
//         if(end == o.end){
//             return start > o.start ? 1 : -1;
//         }
//         return end > o.end ? 1 : -1;
//     }
// }

class ActivitySelection{
    static class C implements Comparator<int[]> {
        public int compare(int[] a1, int[] a2) {
            return Integer.compare(a1[1], a2[1]);
        }
    } 

    static int activitySelection(int n, int starting[], int ending[]){
        int [][] points = new int [n][2];
        for(int i=0; i<n; i++){
            points[i][0] = starting[i];
            points[i][1] = ending[i];
        }

        Arrays.sort(points, new C());
        long last = Long.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < points.length; i++) {
            if (last <= points[i][0]) {
                last = points[i][1];
                count++;
            }
            
        }
        return count;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int starting[]=new int[n];
        int ending[]=new int[n];
        for(int i=0;i<n;i++)
        {
            starting[i]=sc.nextInt();
            ending[i]=sc.nextInt();
        }
        System.out.println(activitySelection(n,starting,ending));
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
