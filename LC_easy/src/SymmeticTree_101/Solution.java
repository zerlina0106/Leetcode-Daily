package SymmeticTree_101;


public class Solution {
	public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

	/**
	 * 看二叉树是否为对称的
	 * 对左右子树分别先序遍历，如果有不同的节点就是FALSE
	 */

	public boolean traverse(TreeNode lRoot, TreeNode rRoot){
		if(lRoot==null && rRoot==null){
			return true;
		}
		if(lRoot==null || rRoot==null){
			return false;
		}

		return traverse(lRoot.left,rRoot.right)
				&& traverse(lRoot.right,rRoot.left)
				&& (lRoot.val == rRoot.val);

	}
	public boolean isSymmetric(TreeNode root) {
		if(root == null)    return true;
		return traverse(root.left, root.right);


	}
}
