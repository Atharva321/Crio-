// Time  : O(1)
// Space : O(1)

import java.util.*;

public class Solution {

    public static double multiplyTwoDecimals(double a, double b) {
        return a*b;
    }

    public static void main(String args[]) {
        assert (multiplyTwoDecimals(896.78, 11.5) == 10312.97) : "Expect 10312.97 for a = 896.75, b = 11.5";
        System.out.println("All test cases in main function passed");

    }
}

