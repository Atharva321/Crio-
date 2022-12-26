import java.util.*;

class NextGreaterElementWithSameSetOfDigits{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        System.out.print(nextGreaterElementWithSameSetOfDigits(n));
    }

    static int nextGreaterElementWithSameSetOfDigits(int n){
      
      String str = Integer.toString(n);
      StringBuilder s = new StringBuilder(str);
      for(int i=1; i<s.length(); i++){
        if(s.charAt(i-1) >= s.charAt(i)){
          if(i+1 == s.length()) return -1;
        }
        else break;
      }
      Stack<Integer> st = new Stack<>();
      for(int i=s.length()-1; i>=0; i--){
        if(s.charAt(i-1) >= s.charAt(i)){
          st.add(i);
        }
        else{
          st.add(i);
          int tp=st.peek();
          while(!st.isEmpty() && s.charAt(i-1) < s.charAt(st.peek())){
            tp = st.peek();
            st.pop();
          }
          s.setCharAt(i-1, str.charAt(tp));
          s.setCharAt(tp, str.charAt(i-1));
          String ans = "";
          // two strings
          //first String
          String first = s.toString().substring(0,i);

          //second string
          String two = s.toString().substring(i,s.length());
          StringBuilder rstr = new StringBuilder(two);
          two = rstr.reverse().toString();

          ans += first + two;
          return Integer.parseInt(ans);
        }
      }
      return -1;
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
