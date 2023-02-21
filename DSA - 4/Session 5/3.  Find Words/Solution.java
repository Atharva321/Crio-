import java.io.*;
import java.util.*;

public class WordSearch {
    int rowDir [] = {-1,1,0,0};
    int colDir [] = {0,0,-1,1};
    static boolean [][] checker;
    
    public boolean exist(char[][] board, String word) {
        boolean [][] checker = new boolean [board.length][board[0].length];
        for(int i = 0 ; i < board.length ; i++) {
            for(int j = 0 ; j < board[0].length;  j++) {
                tracker(checker);
                if(isFound(board, checker, word, i, j, 0)) return true;
            }
        }
        return false;
    }
    public boolean isFound(char[][] board,boolean[][] checker, String word, int row, int col, int i){
        if(row >= 0 && row < board.length && col >= 0 && col < board[0].length){
            if(board[row][col] == word.charAt(i) && checker[row][col] == false){
                //base case
                if(i == word.length() -1) return true;
                
                checker[row][col] = true;
                i++;
                
                return isFound(board, checker, word, row-1, col, i) 
                || isFound(board, checker, word, row+1, col, i) 
                || isFound(board, checker, word, row, col-1, i) 
                || isFound(board, checker, word, row, col+1, i);
            }
        }
        return false;
    }

    public void tracker(boolean[][] checker){
        for(int i=0; i<checker.length; i++){
            for(int j=0; j<checker[0].length; j++){
                checker[i][j] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        char board[][] = new char [row][col];
        for(int i = 0 ; i < row ; i++) {
            for(int j = 0 ; j < col;  j++) {
                board[i][j] = scanner.next().charAt(0);
            }
        }
        String word = scanner.next();
        scanner.close();
        boolean result = new WordSearch().exist(board , word);
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
