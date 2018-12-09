package MergeTwoSortedlLists_21;

import MergeTwoSortedlLists_21.Solution.ListNode;

public class Approches {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode head,temp;
		if(l1.val < l2.val){
			temp = l1;
			l1 = l1.next;
		}else{
			temp = l2;
			l2 = l2.next;
		}
		head = temp;

		while(l1!=null && l2!=null){
			if(l1.val < l2.val){
				temp.next = l1;
				l1 = l1.next;
			}else {
				temp.next = l2;
				l2 = l2.next;
			}
			temp = temp.next;
		}
		if(l1 !=null){
			temp.next = l1;
		}else {
			temp.next = l2;
		}
		return head;
	}
}
