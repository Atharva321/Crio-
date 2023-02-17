// Time  : O(n)
// Space : O(1)

import java.util.*;

class ReverseNum {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int reverse = reverseNum(num);

        System.out.println(reverse);

    }

    // TODO: Implement this method
    static int reverseNum(int num) {
        StringBuilder str = new StringBuilder();
        int rem = 0;
        while(num!=0){
            rem = num%10;
            num /= 10;
            str.append(rem);
        }
        return Integer.parseInt(str.toString());
    }
}
