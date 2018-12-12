package BinaryTreeLevelOrderTraversal_II_107;

import org.junit.Test;

import java.util.*;

public class Solution {
	public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
   }
	/**
	 * 二叉树层序遍历 使用队列是正序,此时要分层layer
	 * @param root
	 * @return
	 */

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<>();
		List<List<Integer>> lists = new LinkedList<>();

		if(root == null) return lists;

		//根节点入队
		queue.offer(root);
		while(!queue.isEmpty()){
			//队列中当前个数就是已经加过队列的一层中完整的元素的个数
			int levelNum = queue.size();
			List<Integer> subList = new LinkedList<>();
			for(int i=0; i<levelNum; i++){
				if(queue.peek().left != null) queue.offer(queue.peek().left);
				if(queue.peek().right != null) queue.offer(queue.peek().right);
				//poll()放回并推出第一个，for循环会把这一层所有的都推出
				subList.add(queue.poll().val);
			}
			//倒序存就每次都加在第一个
			lists.add(0,subList);
		}
		return lists;
	}
	@Test
	public void main(){
		TreeNode r = new TreeNode(3);
		TreeNode l1 = new TreeNode(9);
		TreeNode r1 = new TreeNode(20);
		TreeNode l2 = new TreeNode(15);
		TreeNode r2 = new TreeNode(7);
		r.left=l1;r.right=r1;r1.left=l2;r1.right=r2;
		levelOrderBottom(r);
	}
}
