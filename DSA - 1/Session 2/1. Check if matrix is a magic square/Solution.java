import java.util.*;

class CheckMagicSquare {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int grid[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        }

        String result = checkMagicSquare(n, grid);

        System.out.println(result);

    }
    //rowSum

    //columnSum

    //diagonalSum

    // TODO: Implement this method
    static String checkMagicSquare(int n, int[][] grid) {
    int N = n*n, sum = N*(N+1)/(2*n);
    //rowSum
    int row=0;
    while(row < grid.length){
         int rowSum = 0;
        for(int i=0; i<grid[0].length; i++){
            rowSum += grid[row][i];
        }
        row++;
        //System.out.println("Line 43");
        if(rowSum != sum) return "No";
    }

    //columnSum
    int column = 0;
    while(column < grid.length){
        int columnSum = 0;
        for(int i=0; i<grid[0].length; i++){
            columnSum += grid[i][column];
        }
        column++;
        //System.out.println("Line 55");
        if(columnSum != sum) return "No";
    }

    //diagonalSum
    row = 0; column = 0;
    int diagonalSumLR = 0;
    while(row<n && column<n){
        diagonalSumLR += grid[row][column];
        row++;
        column++;
    }
    //System.out.println("Line 67");
    if(diagonalSumLR != sum) return "No";

    row = 0; column = n-1;
    int diagonalSumRL = 0;
    while(row<n && column>=0){
        diagonalSumRL += grid[row][column];
        row++;
        column--;
    }
    //System.out.println("Line 77");
    if(diagonalSumRL != sum) return "No";

    return "Yes";
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
