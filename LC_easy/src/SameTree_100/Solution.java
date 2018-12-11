package SameTree_100;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
   }
//    List<Integer> list = new LinkedList<>();

	public List<Integer> traverse(TreeNode root, List<Integer> list){
		if(root == null){
			//这里是防止只有两个节点结构不一样的情况
			//Test case:
			// [1,2]
			//[1,null,2]
			list.add(-1);
			return list;
		}
		list.add(root.val);
		traverse(root.left,list);
		traverse(root.right,list);
		return list;
	}
	public boolean isSameTree(TreeNode p, TreeNode q) {

		List<Integer> plist = new LinkedList<>();
		List<Integer> qlist = new LinkedList<>();
		plist = traverse(p, plist);
		qlist = traverse(q, qlist);
		/**
		 * 尝试一下，居然真的可以完美的判断两个链表是否相等
		 */
		if(plist.equals(qlist)){
			return true;
		}else return false;
	}
}
