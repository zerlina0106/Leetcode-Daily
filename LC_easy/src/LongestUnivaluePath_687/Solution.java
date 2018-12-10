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
	//返回值就是代表当前节点开始往下延伸,最长路径的值,注意不包括回来的值,就是只遍历一边的节点
	public int nodeTraverse(TreeNode node){
		//如果这个节点是叶子节点,就返回0
		if(node == null || node.left == null && node.right == null){
			return 0;
		}

		int leftPath;
		int rightPath;
		// 用递归的时候,就把这个函数当成已经完成的并且可以返回正确的值
		// 这里面就是,把nodeTraverse看做是一个可以正确返回这个节点最长路径的函数
		// leftValue 就是,左子节点往下延伸时候的最长路径,right同理
		int leftValue = nodeTraverse(node.left);
		int rightValue = nodeTraverse(node.right);
		// leftPath代表是从当前节点开始,从左子节点开始递归的时候的最大长度
		// 如果当前左子节点的值和自己的值是相等的,那么leftPath就是左子节点的值+1
		// 如果左子节点的值和自己当前的值不相等的话,那么leftPath的值就应该是0
		if(node.left != null && node.val == node.left.val){
			leftPath = leftValue + 1;
		} else {
			leftPath = 0;
		}
		// 右子节点同样
		if(node.right != null && node.val == node.right.val){
			rightPath = rightValue + 1;
		} else {
			rightPath = 0;
		}
		// 如果左右都不是0,就代表左右子节点的值和自己的值都是相等的,那么相加就是代表连通起来的值
		if((leftPath+rightPath) >= maxPath){
			maxPath = leftPath+rightPath;
		}
		// 返回左右path的最大值,就代表当前节点延下遍历最长的路径的值
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
