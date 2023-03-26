import java.util.*;

class WiggleSort{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer>nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }
        List<Integer>ans = wiggleSort(n,nums);
        for (int i = 0; i < n; i++) {
            System.out.print(ans.get(i)+" ");
        }
    }

    static List<Integer> wiggleSort(int n, List<Integer>nums){
        for(int i=0; i<n-1; i++){
            if((i%2==0 && nums.get(i)>nums.get(i+1)) || (i%2!=0 && nums.get(i)<nums.get(i+1))){
                //swap
                int num = nums.get(i);
                nums.set(i, nums.get(i+1));
                nums.set(i+1, num);
            }
        }
        return nums;
    }
}

/* 
  Crio Methodology
  
  Milestone 1: Understand the problem clearly
  1. Ask questions & clarify the problem statement clearly.
  2. *Type down* an example or two to confirm your understanding of the input/output & extend it to test cases
  1 5 1 1 6 4
  0 1 2 3 4 5
  1 4 1 5 1 6
   
   even index: i < i+1
   odd index : i > i+1 

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
