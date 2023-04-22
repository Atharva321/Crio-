// Time  : O(nlogn)
// Space :

import java.util.*;

class SortArrayAbsolute {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        //SortArrayAbsolute srt = new SortArrayAbsolute();
        int res[] = sortArrayAbsolute(n, arr);

        for (int j : res)
            System.out.print(j + " ");
    }
    // class CustomComp extends Comparator<Integer> {
    //     @Override
    //     public int compare(Integer i1, Integer i2) {
    //         if (Math.abs(i1) < Math.abs(i2)){
    //             return -1;
    //         }
    //         else if (Math.abs(i1) > Math.abs(i2)){
    //             return 1;
    //         }
    //         else if (i1 > i2){
    //             return 1;
    //         }
    //         else if (i1 > i2){
    //             return 1;
    //         }
    //         else{
    //             return 0;
    //         }
    //     }
    // }
    
    static int[] sortArrayAbsolute(int n, int arr[]) {
         
        Integer ar [] =  new Integer [n];
        for(int i=0; i<n; i++){
            ar[i] = new Integer(arr[i]);
        }
        // Arrays.sort(ar, (a, b) -> Math.abs(a) - Math.abs(b));
        
        Arrays.sort(ar, new Sortbyroll());
        
        for(int i=0; i<n; i++){
            arr[i] =ar[i];
        }
        return arr;
    }
}
class Sortbyroll implements Comparator<Integer> {
    // Method
    // Sorting in ascending order of roll number
        public int compare(Integer a, Integer b){
            return Math.abs(a) - Math.abs(b);
        }
    }



/* 
Crio Methodology

Milestone 1: Understand the problem clearly
1. Ask questions & clarify the problem statement clearly.
2. Take an example or two to confirm your understanding of the input/output & extend it to test cases
Milestone 2: Finalize approach & execution plan
1. Understand what type of problem you are solving.
     a. Obvious logic, tests ability to convert logic to code
     b. Figuring out logic
     c. Knowledge of specific domain or concepts
     d. Knowledge of specific algorithm
     e. Mapping real world into abstract concepts/data structures
2. Brainstorm multiple ways to solve the problem and pick one
3. Get to a point where you can explain your approach to a 10 year old
4. Take a stab at the high-level logic & write it down.
5. Try to offload processing to functions & keeping your main code small.
Milestone 3: Code by expanding your pseudocode
1. Make sure you name the variables, functions clearly.
2. Avoid constants in your code unless necessary; go for generic functions, you can use examples for your thinking though.
3. Use libraries as much as possible
Milestone 4: Prove to the interviewer that your code works with unit tests
1. Make sure you check boundary conditions
2. Time & storage complexity
3. Suggest optimizations if applicable
*/
