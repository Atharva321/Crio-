import java.util.*;

class PostfixExpression {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();

        int val = postfixExpression(exp);
        System.out.println(val);
    }

    // TODO: Implement this method
    static int postfixExpression(String s) {
        if(s.length()==0) return -1;
        if(s.length()==1) return Integer.parseInt(String.valueOf(s));
        Stack<Integer> ints = new Stack<>();

        int count = 0;
        int ans = 0;
        while(count < s.length()){
            char ch = s.charAt(count);
            if(Character.isDigit(s.charAt(count))){
                ints.push(Integer.parseInt(String.valueOf(ch)));
            }
        
            // +: addition operator
            else if(ch == '+'){
                int num2 = ints.pop();
                int num1 = ints.pop();
                ints.push(num1 + num2);
                //ans += num1 + num2;
            }

            // -: substraction operator
            else if(ch == '-'){
                int num2 = ints.pop();
                int num1 = ints.pop();
                ints.push(num1 - num2);
                //ans += num1 - num2;
            }

            // *: multiplication operator
            else if(ch == '*'){
                int num2 = ints.pop();
                int num1 = ints.pop();
                ints.push(num1 * num2);
                //ans += num1 * num2;
            }

            count++;
        }
        return ints.pop();
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
