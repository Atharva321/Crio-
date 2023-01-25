import java.util.*;
import crio.ds.List.ListNode;

/*
public class ListNode {
   public int val; 
   public ListNode next;
   public ListNode(int x) { val = x; next = null; }
}
Conditions:
head -> any node
any node -> tail
head-> tail

reverse LL
keep tarck of prev and next node of head and tail respectively
*/

class Solution{

	public ListNode reverseEvenElements(ListNode head)
	{
		if (head == null || head.next == null) 
         return head;
      
      ListNode dummy = new ListNode(0);
      dummy.next = head;
      ListNode curr = dummy;

      while (curr != null && curr.next != null) {


         if (curr.next.val % 2 == 0 ) {
            
            ListNode gEnd = curr.next;
            while(gEnd != null && gEnd.val % 2 == 0)
               gEnd = gEnd.next;

            curr = reverseList(curr, gEnd);
         }

        curr = (curr != null) ? curr.next : null;
      }

      return dummy.next;
	}

   ListNode reverseList(ListNode start, ListNode end) {
      
      ListNode newEnd = start.next;
      ListNode curr = start.next;
      ListNode prev = null;
      ListNode next = null;

      while (curr != end) {
         next = curr.next;
         curr.next = prev;
         prev = curr;
         curr = next;
      }

      newEnd.next = curr;
      start.next = prev;

      return newEnd;
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
