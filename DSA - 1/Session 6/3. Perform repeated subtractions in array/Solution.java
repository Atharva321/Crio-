import java.util.*;


class ReduceArray{
    // NOTE: Please do not modify this function
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];

        for(int i=0;i<n;i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        int ans = reduceArray(n, a);
        System.out.println(ans);
    }

    // TODO: Implement this method
    static int reduceArray(int n, int arr[]){
        if(arr == null)
    {
        return 0;
    }
     
    // Priority queue can be used
    // to construct max-heap
    PriorityQueue<Integer> heap = new
    PriorityQueue<Integer>(Collections.reverseOrder());
     
    // Insert all element of arr[]
    // into priority queue
    for(int i = 0; i < n; i++)
    {
       heap.offer(arr[i]);
    }
     
    // Perform operation until heap
    // size becomes 0 or 1
    while (heap.size() > 1)
    {
         
        // Remove largest element
        int X = heap.poll();
         
        // Remove 2nd largest element
        int Y = heap.poll();
         
        // If extracted element
        // are not equal
        if (X != Y)
        {
            // Find X - Y and push
            // it to heap
            int diff = Math.abs(X - Y);
            heap.offer(diff);
        }
    }
     
    // If heap size is 1, then
    // print the remaining element
    // Else print "-1"
    return heap.size() == 1 ? heap.poll() : 0;
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