package LinkedList.MergeTwoSortedlLists_21;

public class Solution {

	public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1==null && l2==null){
			return null;
		}

		ListNode temp;
		if(l1 != null && l2 != null){
			if(l1.val<l2.val){
				temp = new ListNode(l1.val);
				l1 = l1.next;
			}else {
				temp = new ListNode(l2.val);
				l2 = l2.next;
			}
		}else if(l1 !=null ){
			temp = new ListNode(l1.val);
			l1 = l1.next;
		}else{
			temp = new ListNode(l2.val);
			l2 = l2.next;
		}

		ListNode head = temp;

		while(l1 != null && l2 != null){
			if(l1.val < l2.val ){
				temp.next = new ListNode(l1.val);
				temp = temp.next;
				l1 = l1.next;
			}else{
				temp.next = new ListNode(l2.val);
				temp = temp.next;
				l2 = l2.next;
			}
		}

		while(l1 != null){
			temp.next = new ListNode(l1.val);
			temp = temp.next;
			l1 = l1.next;
		}
		while(l2 != null){
			temp.next = new ListNode(l2.val);
			temp = temp.next;
			l2 = l2.next;
		}

		return head;

	}
}
