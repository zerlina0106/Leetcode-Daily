package LinkedList.RemoveLinkedListElements_203;

public class Solution {
	public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
   }

		public ListNode removeElements(ListNode head, int val) {
			while (head != null && head.val == val) head = head.next;
			ListNode curr = head;
			while (curr != null && curr.next != null)
				if (curr.next.val == val) curr.next = curr.next.next;
				else curr = curr.next;
			return head;
		}


}
