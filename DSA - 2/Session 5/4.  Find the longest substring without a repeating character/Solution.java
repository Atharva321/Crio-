import java.util.*;

class LongestSubstringWithoutRepeatingCharacter {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        if(s.length() == 1) return 1;

        int[] chars = new int[128];
 
        int left = 0;
        int right = 0;
 
        int res = 0;
        while (right < s.length()) {
            char r = s.charAt(right);
            chars[r]++;
 
            while (chars[r] > 1) {
                char l = s.charAt(left);
                chars[l]--;
                left++;
            }
 
            res = Math.max(res, right - left + 1);
 
            right++;
        }
        return res;
        // HashMap<Character, Integer> hmap = new HashMap<>();
        // int max = 1;
        // int start = 0;
        // int end = 1;
        // hmap.put(s.charAt(0), 0);
        // while(end < s.length()){
        //     if(!hmap.containsKey(s.charAt(end))){
        //         hmap.put(s.charAt(end), end);
        //     }
        //     else if(s.charAt(end) != s.charAt(end-1)){
        //         start = hmap.get(s.charAt(end))+1;
        //         hmap.put(s.charAt(end), end);
        //         //System.out.println(hset);
        //     }
        //     else{
        //         hmap.put(s.charAt(end), end);
        //     }
        //     if(max < end - start + 1){
        //        max = end - start + 1;
        //     }
        //     end++;
        // }
        // return max;
    }
/*
    dacdf
    d
    da
    dac
    dac
    dacf

    dadcdf
    d
    da
    da
    dac
    dac
    dacf
*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int result = new LongestSubstringWithoutRepeatingCharacter().lengthOfLongestSubstring(s);
        System.out.println(result);
    }
}

/* 
Crio Methodology

Milestone 1: Understand the problem clearly
1. Ask questions & clarify the problem statement clearly.
2. Take an example or two to confirm your understanding of the input/output & extend it to test cases

TestCase 1:
jyvzhkkodacgpkiegodoasxdsaakbahjdczjatkvpgbheawvdjxiegsoalddbtoxuaataniraqslgbjvgz

Testcase 2:
dacdf

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
