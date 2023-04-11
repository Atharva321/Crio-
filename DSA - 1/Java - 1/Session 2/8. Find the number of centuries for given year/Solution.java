import java.util.*;

public class Solution {

  public static int findCenturyFromYear(int a) {
    if(a%100!=0){
      return 1+ a/100;
    }
    else return a/100;
  }

  public static void main(String args[]) {
        assert (findCenturyFromYear(1705) == 18) : "Expect 18 for a = 1705";
        System.out.println("All test cases in main function passed");

    }
}
