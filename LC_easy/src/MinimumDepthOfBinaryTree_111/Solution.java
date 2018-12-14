package MinimumDepthOfBinaryTree_111;

import org.junit.Test;

public class Solution {
	public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
   }

   public int traverse(TreeNode root){
		if(root == null){
			return 0;
		}
		int l = traverse(root.left);
		int r = traverse(root.right);
		if(root.left!=null && root.right!=null){
			return 1+Math.min(l,r);
		}else if(root.left==null){
			return 1+r;
		}else {
			return 1+l;
		}
   }
	public int minDepth(TreeNode root) {
		return traverse(root);
	}
	@Test
	public void main(){
		TreeNode r = new TreeNode(1);
		TreeNode l = new TreeNode(2);
		r.left = l;
		minDepth(r);

	}
}
