package LinkedList.LinkedListCycle_141;


public class Solution {
	class ListNode {
       int val;
       ListNode next;
       ListNode(int x) {
           val = x;
           next = null;
       }
   }

	public boolean hasCycle(ListNode head) {
		if(head == null
				||head.next == null
				||head.next.next==null) return false;

		ListNode a = head;
		ListNode b = head;
		while(a.next!=null && b.next!=null && b.next.next!=null){
			a = a.next;
			b = b.next.next;
			if(a.val == b.val){
				return true;
			}
		}
		return false;
	}
}
