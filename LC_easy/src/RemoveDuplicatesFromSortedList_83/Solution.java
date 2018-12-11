package RemoveDuplicatesFromSortedList_83;

import org.junit.Test;

public class Solution {
	public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
   }
	public ListNode deleteDuplicates(ListNode head) {
		//用于移动
		ListNode temp = head;
		while(temp!=null && temp.next != null){
			if(temp.val == temp.next.val){
				if(temp.next.next!=null){
					temp.next = temp.next.next;
				}else{
					temp.next = null;
				}
			}else {
				temp = temp.next;
			}
		}
		return head;
	}

	@Test
	public void main(){
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(1);
		ListNode l3 = new ListNode(1);
		ListNode l4 = new ListNode(3);
		ListNode l5 = new ListNode(3);
		l1.next = l2;
		l2.next = l3;
//		l3.next = l4;
//		l4.next = l5;
		deleteDuplicates(l1);
	}
}
