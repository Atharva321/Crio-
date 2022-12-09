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

    static ArrayList<Integer> largestSubarraySumZero(int n, int arr[]) {
    //Define conditions to move pointer 
    
    /*
    2 3 1 -4 0 6
    2 5 6  2 2 9
    3 4
    5 6  2 2 8
    */

    //Create HashMap to store the sum and frequency
    HashMap<Integer, Integer> hmap = new HashMap<>();
    
    //Declare variable to store maxLength
    int maxLength = -1;

    //Variable to store max sub-array start
    int maxStart = -1;

    //Variable to store max sub-array end
    int maxEnd = -1;
    
    //Creating the pointer to traverse the array.
    int end = 0;

    //Creating variable to keep track of sum[Prefix Sum].
    int sum = 0;

    while(end < n){
        // If we found sum in HashMap then the we get potential subarray of max sum 0.
        
        sum += arr[end];
        if(hmap.containsKey(sum)){
            int start = hmap.get(sum); 
            if(arr[start] != 0){
                start++;
            }
            //Update the array indexes
            if(maxLength < end - start + 1){
                maxLength = end - start + 1;
                maxStart = start;
                maxEnd = end;
            }
        }
        else{
            hmap.put(sum, end);
        }
        end++;
    }

    //Create an ArrayList to store answer.
    ArrayList<Integer> ans = new ArrayList<>();

     //If array doesn't contains array with sum 0. 
    //then add -1 and return Arraylist.
    if(maxLength == -1){
        ans.add(-1);
        return ans;
    }

    //Storing max sub-array in arraylist.
    for(int i=maxStart; i <= maxEnd; i++){
        ans.add(arr[i]);
    }
    //System.out.println("maxStart : " + maxStart + " maxEnd : " + maxEnd);
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
