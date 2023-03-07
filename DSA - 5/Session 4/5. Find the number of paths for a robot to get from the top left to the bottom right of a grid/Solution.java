import java.io.*;
import java.util.*;
class UniquePaths {
    public int uniquePaths(int m, int n) {

        if(m == 0 && n == 0) return 0;

        if(m == 0 || n == 0) return 0;

        int mod = 1000000007;

        int [][] ways = new int [m+1][n+1];

        for(int i=0; i<=n; i++){
            ways[0][i] = 1;
        }

        for(int i=0; i<=m; i++){
            ways[i][0] = 1;
        }

        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                ways[i][j] = (ways[i-1][j] + ways[i][j-1]) % 1000000007;
            }
        }

        return ways[m-1][n-1];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();
        int result = new UniquePaths().uniquePaths(m , n);
        System.out.println(result);
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
