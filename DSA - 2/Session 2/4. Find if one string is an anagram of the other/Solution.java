import java.io.*;
import java.util.*;

// Time  : O(3*n)  ~ O(n)
// Space : O(2*26) ~ O(1)
public class ValidAnagram {
    public boolean validAnagram(String s, String t) {
        
        /*
        Approach: 
        - Create two arrays with size of 26 and increment repseccted index with character occurence.
        - If any element at same index is not equal then return false.
        - Then check this two arrays if all indexes are equal then strings are anagram.
        */
        
        int firstString [] = new int [26];
        Arrays.fill(firstString, 0);
        
        for(int i=0; i<s.length(); i++){
            firstString[s.charAt(i) - 'a']++;
        }
        
        int secondString[] = new int [26];
        Arrays.fill(firstString, 0);
        
        for(int i=0; i<t.length(); i++){
            secondString[t.charAt(i) - 'a']++;
        }
        
        //Checking if two arrays are equal or not.
        for(int i=0; i<26; i++){
            if(firstString[i] != secondString[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        String t = in.readLine();

        boolean result = new ValidAnagram().validAnagram(s, t);
        System.out.print(String.valueOf(result));
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
