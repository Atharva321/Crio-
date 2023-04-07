import java.util.*;

class ModularExponentiation {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        int ans = modularExponentiation(x, n);
        System.out.println(ans);
    }

    // TODO: Implement this method
    static int modularExponentiation(int x, int n) {
         int modulo = 1000000007;
        long product = 1;
        long p = x;
        while (n != 0) {
            if ((n & 1) == 1) {
                product = product * p % modulo;
            }
            p = (p * p % modulo);
            n >>= 1;
        }
        return (int) product;
    }
}
