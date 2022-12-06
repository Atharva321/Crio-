import java.util.*;


class IntersectionOfTwoArrays2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[m];

        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }

        for(int i=0;i<m;i++)
        {
            arr2[i]=sc.nextInt();
        }
        int ans[]=intersectionOfTwoArrays2(arr1,arr2);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }

    static int[] intersectionOfTwoArrays2(int arr1[], int arr2[]){
        HashMap<Integer, Integer> hmap = new HashMap<>();
        
        for(int i=0; i<arr1.length; i++){
            if(!hmap.containsKey(arr1[i])){
                hmap.put(arr1[i], 1);
            }
            else{
                hmap.put(arr1[i], hmap.get(arr1[i])+1);
            }
        }
        int j = 0;
        ArrayList<Integer> duplicates = new ArrayList<>();
        for(int i=0; i<arr2.length; i++){
            if(hmap.containsKey(arr2[i]) && hmap.get(arr2[i]) !=0){
                duplicates.add(arr2[i]);
                hmap.put(arr2[i], hmap.get(arr2[i])-1);
            }
        }
        int[] ans = new int [duplicates.size()];
        for(int num: duplicates){
            ans[j++] = num;
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
