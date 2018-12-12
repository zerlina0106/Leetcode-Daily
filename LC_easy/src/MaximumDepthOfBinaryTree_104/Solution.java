package MaximumDepthOfBinaryTree_104;

public class Solution {
	public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
   }

	/**
	 * 这个问题可以化为子问题求解
	 * h-3 = 1+max(h-9,h-20)
	 * h-20 = 1+max(h-15,h-7)
	 * 然后到叶子节点的时候就返回1
	 *
	 */

	public int maxDepth(TreeNode root) {
		if(root == null){
			return 0;
		}else{
			int leftDepth = maxDepth(root.left);
			int rightDepth = maxDepth(root.right);
			return 1+Math.max(leftDepth,rightDepth);
		}

	}
}
