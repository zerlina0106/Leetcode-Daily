package Array.easy.MoveZeroes_283;

public class Solution {
	public void moveZeroes(int[] nums) {
		int zeroIndex = Integer.MAX_VALUE;
		for(int i=0; i<nums.length; i++){
			if(nums[i]==0 && zeroIndex == Integer.MAX_VALUE){
				zeroIndex = i;
				continue;
			}
			if(zeroIndex != Integer.MAX_VALUE && nums[i]!=0){
				int temp = nums[i];
				nums[zeroIndex] = temp;
				nums[i] = 0;
				i = zeroIndex;
				zeroIndex = Integer.MAX_VALUE;
				continue;
			}
		}
	}
}
