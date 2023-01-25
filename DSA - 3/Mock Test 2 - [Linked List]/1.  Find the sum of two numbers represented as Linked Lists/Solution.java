/*
public class ListNode {
   public int val; 
   public ListNode next;
   public ListNode(int x) { val = x; next = null; }
}
*/

// Time  : O(n)
// Space : O(1)

import java.io.*;
import java.util.*;
import crio.ds.List.ListNode;
class Solution {
  public static ListNode sumLists1( ListNode l1 , ListNode l2) {
    ListNode res = new ListNode(0);
    ListNode tail = res;

    int carry = 0;
    while (l1 != null || l2 != null || carry != 0) {
      
      int sum = 0;
      if (l1 != null) {
        sum += l1.val;
        l1 = l1.next;
      }

      if (l2 != null) {
        sum += l2.val;
        l2 = l2.next;
      }

      sum += carry;
      tail.next = new ListNode(sum % 10);
      tail = tail.next;
      carry = sum / 10;
    }

    return res.next;
    // int length1 = 0;
    // ListNode temp = head1;
    // while(temp != null){
    //   temp = temp.next;
    //   length1++;
    // }
    // int length2 = 0;
    // temp = head2;
    // while(temp != null){
    //   temp = temp.next;
    //   length2++;
    // }
    // ListNode ans = head1;
    // if(length1 > length2){
    //   ans = sumLists(head1, head2);
    // }
    // else{
    //   ans = sumLists(head2, head1);
    // }
    // return ans;
  }

  // public static ListNode sumLists( ListNode head1 , ListNode head2) {
  //   int temp = 0;
  //   int carry = 0;
  //   ListNode ans = head1;
  //   while(head2 != null){
  //     // if(head2==null){
  //     //   if(carry != 0){
  //     //     int sum = head1.val + carry;
  //     //   }
  //     // }
  //     temp = head1.val + head2.val + carry;
  //     if(temp > 9){
  //       carry = temp / 10;
  //       head1.val = temp%10;
  //     }
  //     else{
  //       carry = 0;
  //       head1.val = temp;
  //     }
  //     head1 = head1.next;
  //     head2 = head2.next;
  //   }
  //   if(head1.next == null && carry != 0){
  //       head1.next = new ListNode(carry);
  //       head1= head1.next;
  //       carry = 0;
  //   }
  //   while(carry != 0 ){
      
  //     temp = head1.val + carry;
  //     if(temp > 9){
  //       carry = temp / 10;
  //       head1.val = temp%10;
  //     }
  //     else{
  //       carry = 0;
  //       head1.val = temp;
  //     }
  //     if(head1.next == null && carry != 0){
  //       head1.next = new ListNode(carry);
  //       carry = 0;
  //   }
  //     head1 = head1.next;
  //   }
  //   if(head1 == null && carry != 0){
  //       head1 = new ListNode(0);
  //     }
  //   return ans;
  // }


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
