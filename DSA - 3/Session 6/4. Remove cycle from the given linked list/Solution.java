// Time  : O(n)
// Space : O(1)

import crio.ds.List.ListNode;
/*
public class ListNode {
   public int val;
   public ListNode next;
   public ListNode(int x) { val = x; next = null; }
}
*/

public class Solution {
    public boolean detectAndRemoveCycle(ListNode head){
        if(head==null || head.next==null){return false;}
        //initialise slow and fast pointers to head
		ListNode slow=head;
        ListNode fast=head;
		//iterate till null appears and slow ==fast pointer
        while(slow!=null&&fast!=null&&fast.next!=null){
		//slow will do a single jump
            slow=slow.next;
			//fast will do a double jump
            fast=fast.next.next;
			//break when slow==fast
            if(slow==fast)break;
        }
		//if slow!=fast return null as there is no loop
        if(slow!=fast)return false;
		//now initalise slow to head again
        slow=head;
		//now both slow and fast will do a single jump until slow==fast then break
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
		//now you can return slow or fast as booth are same
        ListNode tempSlow = slow;
        while(slow.next!=tempSlow){
            slow = slow.next;
        }
        slow.next = null;
        return true;
    }
}
