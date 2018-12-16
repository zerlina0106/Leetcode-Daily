package BinaryTree.PathSum_112;

public class Solution {
	public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
   }

	public boolean hasPathSum(TreeNode root, int sum) {
		if(root==null){
			return false;
		}
		sum -= root.val;
		//因为这个路是根到叶的所以终止条件是在叶子这里判断sum是否是0
		if(root.left==null && root.right==null) return sum==0;
		//如果没有的话就去左右边找
		return hasPathSum(root.left,sum) || hasPathSum(root.right,sum);
	}
}
