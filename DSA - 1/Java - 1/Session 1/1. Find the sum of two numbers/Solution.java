// Time  : O(n)
// Space : O(1)

import java.util.*;

public class Solution {

    public static int sumOfTwoNumbers(int a, int b) {
        return a+b;
    }

    public static void main(String args[]) {
        assert (sumOfTwoNumbers(100, 899) == 999) : "Expect 666 for a = 100, b = 566";
        System.out.println("All test cases in main function passed");

    }
}
