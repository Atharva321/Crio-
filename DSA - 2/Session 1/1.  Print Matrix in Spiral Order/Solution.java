// Time  : O(n^2)
// Space : O(n)

import java.util.*;

class SpiralMatrixII {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result[][] = spiralMatrixII(n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] spiralMatrixII(int n) {
        int spiralMatrix [][] = new int [n][n];
        int left = 0;
        int right = n - 1;
        int up = 0;
        int down = n - 1;

        int count = 0;
        while(count != n*n){
            //left -> right
            for(int i=left; i<=right; i++){
                spiralMatrix[up][i] = ++count;
            }
            up++;

            //up -> down
            for(int i=up; i<=down; i++){
                spiralMatrix[i][right] = ++count;
            }
            right--;

            //right -> left
            for(int i=right; i>=left; i--){
                spiralMatrix[down][i] = ++count;
            }
            down--;

            //down -> up
            for(int i=down; i>=up; i--){
                spiralMatrix[i][left] = ++count;
            }
            left++;
        }
        return spiralMatrix;
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
