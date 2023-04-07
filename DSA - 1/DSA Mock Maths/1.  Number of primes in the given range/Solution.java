// Time  : O(nloglogn)
// Space : O(1)

import java.util.*;

class NumberOfPrimesInRange {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int r = sc.nextInt();
        int ans = numberOfPrimesInARange(l, r);
        System.out.println(ans);
    }

    // TODO: Implement this method
    static boolean isPrime(int n)
    {
        // Corner cases
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;
 
        // This is checked so
        // that we can skip
        // middle five numbers
        // in below loop
        if (n % 2 == 0 || n % 3 == 0)
            return false;
 
        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
 
    return true;
}
    static int numberOfPrimesInARange(int l, int r) {
        int primeNums = 0;
        for(int i = l; i<=r; i++){
            if(isPrime(i)){
                primeNums++;
            }
        }
        return primeNums;
    }

}
