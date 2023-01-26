import java.util.Scanner;
import java.util.*;
import java.lang.*;
import crio.ds.List.*;

/* Definition for a Node.
class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
};
*/

// Time  : O(n)
// Space : O(1)

public class Solution{
    
    public Node copyRandomList(Node head) {
        // duplicates Nodes
        Node tmp = head;
        while (tmp != null) {
            Node newNode= new Node(tmp.val, tmp.next, tmp.random);
            tmp.next = newNode;
            tmp = tmp.next.next;
        }


        // edit random linkes
        Node head2 = head.next;

        while (head2.next != null) {
            if (head2.random != null)
                head2.random = head2.random.next;
            
            head2 = head2.next.next;
        }
        if (head2.random != null)
            head2.random = head2.random.next;

        
        // seperate lists
        Node newHead = head.next;
        
        Node head1 = head;
        head2 = head.next;
        while (head2.next != null) {
            head1.next = head1.next.next;
            head1 = head1.next;

            head2.next = head2.next.next;
            head2 = head2.next;
        }
        head1.next = null;

        return newHead;
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
