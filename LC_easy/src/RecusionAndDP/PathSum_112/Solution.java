package RecusionAndDP.PathSum_112;

public class Solution {
	/**
	 *
	 * 一开始，去通过一个例子，看解题过程，用人脑，来判断应该用递归去做什么（就是一些重复度高的动作）
	 * 然后，对这个例子遍历的过程，确定需要上一步提供哪些值或者定去哪里遍历的量就是函数参数
	 * 返回值类型就是结束的条件的类型
	 */

	public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
   }

   public void tracerse(TreeNode root, int lastSum, int sum){
		if(root == null){
			return ;
		}
		if(root.left==null && root.right==null){
			if(lastSum+root.val == sum){
				throw new RuntimeException();
			}else return ;
		}
		lastSum += root.val;
		tracerse(root.left, lastSum, sum);
		tracerse(root.right,lastSum,sum);

   }

	public boolean hasPathSum(TreeNode root, int sum) {
		try {
			tracerse(root,0,sum);
		}catch (RuntimeException e){
			return true;
		}
		return false;
	}
}
