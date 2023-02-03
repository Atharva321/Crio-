import java.util.*;
// import static org.junit.Assert.assertEquals;

public class Solution {

    public static int addNums(int n) {
        if(n==1){
            return 1;
        }
        return n + addNums(n-1);
    }

    public static void main(String args[]) {
        int n = 3;
        assert addNums(n) == 6 : "Expect 6 for n = 3";
        System.out.println("All test cases in main function passed");
    }
}

