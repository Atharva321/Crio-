import java.util.*;

class SubarraySumZero{
	public static String subarraySumZero(Vector<Integer> arr)
 	{
        String result;
		HashSet<Integer> hset = new HashSet<>();
		int sum = 0;
		for(int i=0; i<arr.size(); i++){

			
			sum += arr.get(i);
			
			//edge 1:
			// for input 10 -10 sum is zero so return true
			if(sum==0) return "Yes";
			
			// 4 5 0 1
			// 4 9 9 -> return true
			if(!hset.contains(sum)){
				hset.add(sum);
			}
			else{
				return "Yes";
			}
		}
        return "No";
	} /*
      4 2 -2 5
	  4 6  4 9

	  3 2 -1
	  3 5  4

	  1 -1
	  1  0
	*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int j=0;j<t;j++)
		{
			int n=sc.nextInt();
			Vector<Integer> arr=new Vector<Integer>();
			for(int i=0;i<n;i++)
			{
				arr.add(sc.nextInt());
			}
			System.out.println(subarraySumZero(arr));
		}

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
