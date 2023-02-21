import java.util.*;

public class NQueens {
    String nQueens(int n) {
        int [][] board = new int [n][n];

        for(int row = 0; row < n; row++){
            for(int col = 0; col < n; col++){
                board[row][col] = 0;
            }
        }
        queenPlacer(board, 0, n);
        if(ans.length() < n*n){
            return "No Solution Exists";
        }
        return "";
    }

    boolean flag = false;

    static String ans = "";

    public static boolean queenPlacer(int [][] board,int row,int n){
        if(row == n){
            ans += stringConverter(board, n);
            return true;
        } 

        for(int col = 0; col < n; col++){
            if(isValid(board, row, col, n)){
                board[row][col] = 1;
                queenPlacer(board, row+1, n);
                board[row][col] = 0;
            }
        }

        // for(int r = 0; r < n; r++){
        //     for(int c = 0; c < n; c++){
        //         System.out.print(board[r][c] + " ");
        //     }
        //     System.out.println();
        // }

        
        return false;
    }

    public static boolean isValid(int [][] board,int row,int col,int n){
        
        //left diaginal
        for(int r=row-1, c=col-1; r>=0 && c>=0; r--,c--){
            if(board[r][c]==1) return false;
        }

        //column
        for(int j=0; j<row; j++){
            if(board[j][col]==1) return false;
        }

        //right diagonal
        for(int r=row, c=col; r>=0 && c<n; r--,c++){
            if(board[r][c]==1) return false;
        }
        
        return true;
    }

    public static String stringConverter(int [][] chessBoard,int n){
        String board = "";
        for(int r = 0; r < n; r++){
            for(int c = 0; c < n; c++){
                System.out.print(chessBoard[r][c] + "");
            }
            System.out.println();
        }
        System.out.println();
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
