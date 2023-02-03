// Time  : O(n)
// Space : O(1)

import java.util.*;

public class Solution {

    static int smallestValueOfArray(int[] numbers, String toReturn) {
        int indexOfSmallValue = -1;
        for(int i=0; i<numbers.length; i++){
            if(smallValue > numbers[i]){
                smallValue = numbers[i];
                indexOfSmallValue = i;
            }
        }
        return (toReturn == "index") ? l : numbers[lowest];;
    }

    public static void main(String args[]) {
        assert (1 == smallestValueOfArray(new int[] { 4, 2, 3, 1, 5 }, "value")) : "Expect 1 for numbers = [4, 2, 3, 1, 5] and toReturn = \"index\"";
        assert (3 == smallestValueOfArray(new int[] { 4, 2, 3, 1, 5 }, "index")) : "Expect 3 for numbers = [4, 2, 3, 1, 5] and toReturn = \"index\"";
        System.out.println("All test cases in main function passed");

    }
}

