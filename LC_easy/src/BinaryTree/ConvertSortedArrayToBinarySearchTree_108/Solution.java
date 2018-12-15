package BinaryTree.ConvertSortedArrayToBinarySearchTree_108;

import org.junit.Test;

public class Solution {
	public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
   }

	/**
	 * BST树
	 * A balaced binary search tree is one that has an equal, or as equal as possible,
	 * number of nodes on each branch. That implies that the best candidate for a root of a tree
	 * is the middle element of a sorted array,
	 * as that allows for an equal divide around the root. Call the middle index mid.
	 *！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
	 * Each left and right branch of our root is also a binary search tree
	 * and should be balanced too,
	 * so we follow the same logic of picking a subroot.
	 * The middle of [0, mid) for the left branch and [mid + 1, n) for the right branch.
	 * It's clear we have a recursive problem that just keeps dividing the array as such until we have a result.
	 *
	 * @param nums
	 * @return
	 */

	public TreeNode sortedArrayToBST(int[] nums) {
    	if(nums.length == 0){
    		return null;
	    }
	    TreeNode root = helper(nums,0,nums.length-1);
    	return root;
	}
	public TreeNode helper(int[] nums, int low, int high) {
		if(low > high){
			return null;
		}
		int mid = (low + high)/2;
		TreeNode node = new TreeNode(nums[mid]);
		node.left = helper(nums,low,mid-1);
		node.right = helper(nums,mid+1, high);
		return node;
	}
	@Test
	public void main(){
		int[] nums = {0,1,2,3,4,5};
		sortedArrayToBST(nums);
	}
}
