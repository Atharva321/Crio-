// Time  : O(nloglogn)
// Space :

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
            //System.out.println(i);
            if(isPrime(i)){
                primeNums++;
            }
        }
        return primeNums;
    }

}

/* 
Crio Methodology

Milestone 1: Understand the problem clearly
1. Ask questions & clarify the problem statement clearly.
2. Take an example or two to confirm your understanding of the input/output & extend it to test cases
Milestone 2: Finalize approach & execution plan
1. Understand what type of problem you are solving.
     a. Obvious logic, tests ability to convert logic to code
     b. Figuring out logic
     c. Knowledge of specific domain or concepts
     d. Knowledge of specific algorithm
     e. Mapping real world into abstract concepts/data structures
2. Brainstorm multiple ways to solve the problem and pick one
3. Get to a point where you can explain your approach to a 10 year old
4. Take a stab at the high-level logic & write it down.
5. Try to offload processing to functions & keeping your main code small.
Milestone 3: Code by expanding your pseudocode
1. Make sure you name the variables, functions clearly.
2. Avoid constants in your code unless necessary; go for generic functions, you can use examples for your thinking though.
3. Use libraries as much as possible
Milestone 4: Prove to the interviewer that your code works with unit tests
1. Make sure you check boundary conditions
2. Time & storage complexity
3. Suggest optimizations if applicable
*/
