// Time  : O(n)
// Space : O(n)

import java.util.*;

public class CircularRace {
    static int circularRace(int n, ArrayList<Integer>gas, ArrayList<Integer>burn){
        int [] diff = new int [n];
        int maxIndex = -1;
        int maxDiff  = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            diff[i] = gas.get(i) - burn.get(i);
            if(maxDiff < diff[i]){
                maxDiff = diff[i];
                maxIndex = i;
            }
        }
        int fuel = 0;
        int remainingFuel = 0;
        int currFuel = 0;
        for(int i=0; i < n; i++){
            fuel = gas.get(i) - burn.get(i);
            if(currFuel >= 0){
                currFuel += fuel;
            }
            else{
                currFuel = fuel;
                maxIndex = i;
            }
            remainingFuel += fuel;
        }
        if(remainingFuel >= 0) return maxIndex+1;
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        ArrayList<Integer>gas = new ArrayList<Integer>();
        ArrayList<Integer>burn = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            gas.add(sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            burn.add(sc.nextInt());
        }
        int ans = circularRace(n,gas,burn);
        System.out.print(ans);
        sc.close();
    }
}


/* 
  Crio Methodology
  
  Milestone 1: Understand the problem clearly
  1. Ask questions & clarify the problem statement clearly.
  2. *Type down* an example or two to confirm your understanding of the input/output & extend it to test cases
  
5
5  6 3  7  4
4  2 1  3  5
diff:
1  4 2  4 -1
pre:
1  5  7  11 10
10 9 5  3 -1  
2  1 2  6  5

  Milestone 2: Finalize approach & execution plan
  1. Understand what type of problem you are solving.
       a. Obvious logic, tests ability to convert logic to code
       b. Figuring out logic
       c. Knowledge of specific domain or concepts
       d. Knowledge of specific algorithm
       e. Mapping real world into abstract concepts/data structures
  2. Brainstorm multiple ways to solve the problem and pick one
  3. Get to a point where you can explain your approach to a 10 year old
  4. Take a stab at the high-level logic & *type it down*.
  5. Try to offload processing to functions & keeping your main code small.
  
  Milestone 3: Code by expanding your pseudocode
  1. Have frequent runs of your code, dont wait for the end
  2. Make sure you name the variables, functions clearly.
  3. Avoid constants in your code unless necessary; go for generic functions, you can use examples for your thinking though.
  4. Use libraries as much as possible
  
  Milestone 4: Prove to the interviewer that your code works with unit tests
  1. Make sure you check boundary conditions
  2. Time & storage complexity
  3. Suggest optimizations if applicable
  */
