package BalancedBinaryTree_110;


public class Solution {
	public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
   }

	/**
	 * 写递归的时候
	 *      函数里面就当成已完成的来用
	 *      返回值就当作正常函数，一般写通式（找几个例子，找出通式，什么叶子结点，中间节点）
	 *      要有一个边界条件，根据参数值的特例（null或者特殊情况）返回通式不适用的值
	 * @param root
	 * @return
	 */
	public int  traverse(TreeNode root){
		if(root == null){
			return 0;
		}
		int l = traverse(root.left);
		int r = traverse(root.right);
		if(Math.abs(l-r)>1) throw  new RuntimeException();
		return 1 + Math.max(l,r);
   }
	public boolean isBalanced(TreeNode root) {
		try{
			traverse(root);
		}catch (RuntimeException e){
			return false;
		}
		return true;
	}
}
