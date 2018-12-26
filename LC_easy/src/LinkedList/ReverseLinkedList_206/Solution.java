package LinkedList.ReverseLinkedList_206;

import org.junit.Test;

public class Solution {
	public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
   }
	public ListNode reverseList(ListNode head) {
		if(head == null) return null;
		ListNode ans = new ListNode(1);
		ans.next = null;
		ListNode temp = new ListNode(head.val);
		temp.next = head.next;
		while(temp != null){
			ListNode p = new ListNode(temp.val);
			if(ans.next == null){
				ans.next = p;
				p.next = null;
				temp = temp.next;
				continue;
			}else{
				p.next = ans.next;
				ans.next = p;
				temp = temp.next;
			}
		}
		return ans.next;
	}

	@Test
	public void main() {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = null;
		reverseList(l1);
	}
}
