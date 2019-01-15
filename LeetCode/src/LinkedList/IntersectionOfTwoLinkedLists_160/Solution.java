package LinkedList.IntersectionOfTwoLinkedLists_160;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class Solution {
	public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) {
           val = x;
           next = null;
       }
   }
   private int length(ListNode node){
		int length = 0;
		while(node != null){
			node = node.next;
			length++;
		}
		return length;
   }

	/**
	 * 这相当于从后往前看的，如果要找，其实只用把小的
	 * @param headA
	 * @param headB
	 * @return
	 */
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		int lenA = length(headA), lenB = length(headB);
		//move headA and headB to the same start point
		while(lenA > lenB){
			headA = headA.next;
			lenA--;
		}
		while(lenA < lenB){
			headB = headB.next;
			lenB--;
		}
		while(headA != headB){
			headA = headA.next;
			headB = headB.next;
		}
		return headA;
	}
	@Test
	public void main(){
		ListNode l1=new ListNode(1);
//		ListNode l2=new ListNode(2);
//		ListNode l3=new ListNode(3);
//		ListNode l4=new ListNode(4);
//		l1.next=l2;l2.next=l3;l4.next=l2;
		this.getIntersectionNode(l1,l1);


	}

}
