package LongestUnivaluePath_687;


import org.junit.Test;

public class Solution {
	public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
   }
	static  int maxPath;
	public int longestUnivaluePath(TreeNode root, int curPath){
		if(root==null || (root.left==null && root.right==null)){
			return maxPath;
		}
		if(root.left!= null && root.left.val == root.val ){
			curPath++;
			maxPath = Math.max(maxPath,curPath);
			longestUnivaluePath(root.left, curPath);

		}else if(root.right!=null && root.right.val == root.val) {

				curPath++;
				maxPath = Math.max(maxPath, curPath);
				longestUnivaluePath(root.right, curPath);
			} else {
				curPath = 0;
				longestUnivaluePath(root.left, curPath);
				longestUnivaluePath(root.right, curPath);
			}

		return maxPath;
	}
	public int longestUnivaluePath(TreeNode root) {
		int  curPath = 0;
		if(root==null){
			return 0;
		}
		if(root.right==null && root.left==null){
			return 0;
		}
		return  longestUnivaluePath(root, curPath);

	}
	@Test
	public void main(){
		TreeNode root = new TreeNode(5);
		TreeNode l1 = new TreeNode(5);
//		TreeNode r1 = new TreeNode(5);
//		TreeNode l2 = new TreeNode(1);
//		TreeNode r20 = new TreeNode(1);
//		TreeNode r21 = new TreeNode(5);
//		root.right = r1;
		root.right = l1;
//		l1.left = l2;
//		l1.right = r20;
//		r1.right = r21;
		System.out.println(longestUnivaluePath(root));

	}
}
