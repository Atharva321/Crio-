// Time  : O(n)
// Space : O(n)

import java.util.*;

class TripleStep {

    public int numberOfWays(int n) {
      if(n==1) return 1;
      int [] dp = new int [n+1];

      dp[0] = 1;
      dp[1] = 1;
      dp[2] = 2;

      for(int i=3; i<dp.length; i++){
        dp[i] = ((dp[i-1] + dp[i-2]) % 1000000007 + dp[i-3]) % 1000000007;
      }
      return dp[n];
    }
 
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        TripleStep tripleStep = new TripleStep();
        // int [] dp = new int [n+1];
        int result = tripleStep.numberOfWays(n%1000000007);
        System.out.println(result);
        scanner.close();
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
