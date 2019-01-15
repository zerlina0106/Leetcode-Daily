package RecusionAndDP.PathSum_112;

public class Solution {
	/**
	 *
	 * 一开始，去通过一个例子，看解题过程，用人脑，来判断应该用递归去做什么（就是一些重复度高的动作）
	 * 然后，对这个例子遍历的过程，确定需要上一步提供哪些值或者定去哪里遍历的量就是函数参数
	 * 返回值类型就是结束的条件的类型
	 *
	 * 首先，两个递归函数要写出来，普遍情况下肯定是要向左向右递归的，然后，对值进行处理，这里面就是 lastSum 加上val，
	 * 然后对递归函数的参数进行填充，再然后就是看什么时候可以满足条件，这里就是，当前节点是叶子结点而且路径和是sum的时候
	 * 因为只要一个有效，别的就都不用看了，所以直接throw出去，再在调用这个递归的函数里面接受它
	 * 最后就是判断一些特殊的情况，比如节点是空的情况下
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
