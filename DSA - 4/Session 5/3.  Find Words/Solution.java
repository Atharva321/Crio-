// Time  : O(4^L)
// Space : O(4L)

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
                if(isFound(board, checker, word, i, j, 0)) return true;
            }
        }
        return false;
    }
    public boolean isFound(char[][] board,boolean[][] checker, String word, int row, int col, int i){
        if(i == word.length()) return true;

        if(row < 0 || row >= board.length || col < 0 || col >= board[0].length || board[row][col] != word.charAt(i) || checker[row][col]){
            return false;
        }  

        checker[row][col] = true;
        i++;
                
        if(    isFound(board, checker, word, row-1, col  , i) 
            || isFound(board, checker, word, row+1, col  , i) 
            || isFound(board, checker, word, row  , col-1, i) 
            || isFound(board, checker, word, row  , col+1, i)){
            return true;
        }
            
        checker[row][col] = false;
        
        return false;
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
