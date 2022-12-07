import java.util.*;

class LargestSubarraySumZero {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        ArrayList<Integer> res = largestSubarraySumZero(n, arr);

        for (int j : res)
            System.out.print(j + " ");

    }
  
  // Time  : O(n)
  // Space : O(n)

    static ArrayList<Integer> largestSubarraySumZero(int n, int arr[]) {
        //Define conditions to move pointer 
    
    /*
    2 3 1 -4 0 6
    3 4
    5 6  2 2 8
    */
    if(n==1){
        ArrayList<Integer> ans= new ArrayList<>();
        if(arr[0] == 0){
            ans.add(0);
            return ans;
        }
        ans.add(-1);
        return ans;
    }
    HashMap<Integer, Integer> hmap = new HashMap<>();
    int sum = 0;
    int start = 0;
    int end = 0;
    int maxLength = -1;
    for(int i=0; i<n; i++){
        sum+= arr[i];
        if(hmap.containsKey(sum)){
            int length = i - hmap.get(sum) + 1;
            if(maxLength < length){
                maxLength = length;
                start = hmap.get(sum)+1;
                end = i;
            }
        }
        else{
            hmap.put(sum, i);
        }
    }
    ArrayList<Integer> ans= new ArrayList<>();
    if(maxLength==-1){
        ans.add(-1);
        return ans;
    }
    for(int i=start; i<= end; i++){
        ans.add(arr[i]);
    }

    return ans;
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
