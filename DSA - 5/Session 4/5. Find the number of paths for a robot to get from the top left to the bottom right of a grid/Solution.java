// Time  : O(m * n)
// Space : O(m * n)

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
