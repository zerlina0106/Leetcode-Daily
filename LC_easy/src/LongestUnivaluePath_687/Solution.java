package LongestUnivaluePath_687;


import org.junit.Test;



public class Solution {
	public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
   }
    int maxPath = 0;
	public int nodeTraverse(TreeNode node){
		int leftPath = 0;
		int rightPath = 0;
		if(node.left == null && node.right == null){
			return leftPath + rightPath;
		}

		if(node.left != null){
			if(node.val == node.left.val){
				leftPath = nodeTraverse(node.left) + 1;
			}else {
				nodeTraverse(node.left);
			}
		}

		if(node.right != null){
			if(node.val == node.right.val){
				rightPath = nodeTraverse(node.right) + 1;
			}else {
				nodeTraverse(node.right);
			}
		}


		if((leftPath+rightPath) >= maxPath){
			maxPath = leftPath+rightPath;
		}
		return Math.max(leftPath,rightPath);
	}
	public int longestUnivaluePath(TreeNode root) {
		if(root != null){
			nodeTraverse(root);
		}
		return maxPath;
	}
	@Test
	public void main(){
		TreeNode root = new TreeNode(1);
		TreeNode l1 = new TreeNode(1);
		TreeNode r1 = new TreeNode(1);
		TreeNode l2 = new TreeNode(3);
		TreeNode r20 = new TreeNode(1);
		TreeNode r21 = new TreeNode(5);
		root.right = r1;
		root.left = l1;
		l1.left = l2;
		l1.right = r20;
		r1.left = r21;
		System.out.println(longestUnivaluePath(root));

	}
}
