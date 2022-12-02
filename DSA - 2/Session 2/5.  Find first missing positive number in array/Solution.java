import java.util.*;

public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int numbers = nums.length;
        
        //We will create hashset to store all numbers of the array
        HashSet<Integer> hset = new HashSet<>();
        for(int i=0; i<numbers; i++){
                hset.add(nums[i]);
                //System.out.println(f + " " + nums[i] + " " + isFound);
            }
        // Arrays.sort(nums);
        int n = 1, f;
        boolean isFound = false;
        
        for(f = 1; f<=numbers; f++){
            if(!hset.contains(f)){
                    return f;
            }
        }
        
        return f;
        //return f+1;
        // for(int i=0; i<nums.length; i++){
        //     System.out.print(nums[i] + " "); 
        // }
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i] > 0 && nums[i] != nums[nums[i]]){
        //         int temp = nums[i];
        //         nums[i]  = nums[nums[i]];
        //         nums[temp] = temp;
        //     } 
        // }
        // //if(nums[0] != 1) return 1;
        // for(int i=0; i < nums.length; i++){
        //     if(nums[i] < 0) return i;
        // }
        //System.out.println(f);
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0 ; i < n ; ++i) {
            nums[i] = in.nextInt();
        }
        int result = new FirstMissingPositive().firstMissingPositive(nums);
        System.out.println(result);
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
