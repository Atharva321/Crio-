import java.util.*;


class LongestValidParentheses{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int ans = longestValidParentheses(S);
        System.out.println(ans);
    }

    static int longestValidParentheses(String str){
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int maxLength = 0;
        for(int i=0; i<str.length(); i++){
            char bracket = str.charAt(i);
            if(bracket == '('){
                st.push(i);
            }
            else{
                if(st.size() > 1){
                    st.pop();
                    maxLength = Math.max(maxLength, i-st.peek());
                }
                else{
                    st.pop();
                    st.push(i);
                }
            }
        }
        //Use Stack to store
        //Use Max element to store max length
        return maxLength;
    }
}

/* 
  Crio Methodology
  
  Milestone 1: Understand the problem clearly
  1. Ask questions & clarify the problem statement clearly.
  2. *Type down* an example or two to confirm your understanding of the input/output & extend it to test cases
  
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
