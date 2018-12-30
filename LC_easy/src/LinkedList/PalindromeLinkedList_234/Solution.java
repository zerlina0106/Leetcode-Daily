package LinkedList.PalindromeLinkedList_234;

import org.junit.Test;

import java.util.Stack;

public class Solution {
	public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
   }
//	public boolean isPalindrome(ListNode head) {
//		if (head == null || head.next == null) return true;
//		ListNode temp = new ListNode(head.val);
//		temp.next = head.next;
//		Stack<Integer> stack = new Stack<>();
//		int i = 0;
//		while(temp != null){
//			stack.push(temp.val);
//			i++;
//			temp = temp.next;
//		}
//		for(int j=0; j<i/2; j++){
//			if(stack.get(j).equals(stack.lastElement())){
//				stack.remove(j);
//				stack.pop();
//				i = stack.size();
//				j--;
//			}
//		}
//		if(i%2 == 0){
//			return stack.isEmpty();
//		}else {
//			return stack.size() == 1;
//		}
//	}
public boolean isPalindrome(ListNode head) {
	ListNode temp = head;
	Stack<Integer> stack = new Stack<Integer>();
	while (temp != null) {
		stack.push(temp.val);
		temp = temp.next;
	}

	while (head != null) {
		if (head.val != stack.pop()) {
			return false;
		}
		head = head.next;
	}
	return true;
}

	@Test
	public void main() {
		ListNode l = new ListNode(1);
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(1);

		l.next = l1;
		l1.next = l2;
		l2.next = l3;
		isPalindrome(l);
	}
}
