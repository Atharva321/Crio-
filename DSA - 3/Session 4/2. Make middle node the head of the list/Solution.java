/*
public class ListNode {
   public int val; 
   public ListNode next;
   public ListNode(int x) { val = x; next = null; }
}
*/
import java.util.*;
import crio.ds.List.ListNode;

class Solution{
	
	public ListNode moveMiddleToHead(ListNode head) {
      if(head == null) return head;
      if(head.next == null) return head;
      int nodes = 0;
      ListNode pointer = head;
      while(pointer != null){
         pointer = pointer.next;
         nodes++;
      }
      nodes = nodes/2;
      pointer = head;
      ListNode prev = pointer;
      int count = 0;
      while(count != nodes){
         prev = pointer;
         pointer = pointer.next;
         count++;
      }
      
      prev.next = prev.next.next;
      ListNode middleHead = pointer;
      pointer.next = head;
      return middleHead; 
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