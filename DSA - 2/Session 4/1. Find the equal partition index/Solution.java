Time Complexity  : O(n)
Space Complexity : O(1)
 
import java.util.*;

class EqualPartition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long arr[] = new long[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextLong();

        int res = equalPartition(n, arr);

        System.out.println(res);

    }

    static int equalPartition(int n, long arr[]) {
        long totalSum = 0;
        for(int i=0; i < n; i++){
            totalSum += arr[i];
        }

        long prefixSum = 0;
        for(int i=1; i<n-1; i++){
            prefixSum += arr[i-1];
            long suffixSum = totalSum - prefixSum -arr[i];
            if(prefixSum == suffixSum){
                return i;
            }
        }
        return -1;
    }

/*
     Time : O(n)
     Space: O(n)
     static int equalPartition(int n, long arr[]) {
        long suffix [] = new long [n];
        suffix[n-1]  = arr[n-1];
        for(int i=n-2; i >= 0; i--){
            suffix[i] = suffix[i+1] + arr[i];
        }

        long prefixSum = 0;
        for(int i=1; i<n-1; i++){
            prefixSum += arr[i-1];
            if(prefixSum == suffix[i+1]){
                return i;
            }
        }
        return -1;
    }
*/
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
