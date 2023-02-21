import java.util.*;

public class NQueens {
    String nQueens(int n) {
        int [][] board = new int [n][n];

        for(int row = 0; row < n; row++){
            for(int col = 0; col < n; col++){
                board[row][col] = 0;
            }
        }

        return queenPlacer(board, 0, n);
    }

    public static String queenPlacer(int [][] board,int row,int n){
        if(row == n) return stringConverter(board, n);

        for(int col = 0; col < n; col++){
            if(isValid(board, row, col, n)){
                board[row][col] = 1;
                queenPlacer(board, row+1, n);
                board[row][col] = 0;
            }
        }

        return "No Solution Exists";
    }

    public static boolean isValid(int [][] board,int row,int col,int n){
        int wall = Math.min(row, col);
        //left diaginal
        int r = row-1;
        int c = col-1;
        while(r>=0 && c>=0){
            if(board[row][col]==1) return false;
            r--;
            c--;
        }

        //column
        for(int j=0; j<col; j++){
            if(board[row][j]==1) return false;
        }

        //right diagonal
        row--;
        col++;
        while(row>=0 && col<n){
            if(board[row][col]==1) return false;
            row--;
            col++;
        }
        
        return true;
    }

    public static String stringConverter(int [][] chessBoard,int n){
        String board = "";
        for(int row = 0; row < n; row++){
            for(int col = 0; col < n; col++){
                board += chessBoard[row][col];
            }
        }
        return board;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =  scanner.nextInt();
        scanner.close();
        NQueens result = new NQueens();
        String board = result.nQueens(n);
        System.out.println(board);
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
