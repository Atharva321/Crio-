// Time  : O(n)
// Space : O(1)

import java.io.*;
import java.util.*;

public class ClimbingStairs {

    public int climbingStairs(int n) {
        if(n==1) return 1;
        int first = 1;
        int second = 2;
        for(int i=3; i<=n; i++){
            int third = first+second;
            first = second;
            second = third;
        }
        return second;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int numberOfStairs = scanner.nextInt();
        scanner.close();
        int result = new ClimbingStairs().climbingStairs(numberOfStairs);
        System.out.print(result);
    }
}
