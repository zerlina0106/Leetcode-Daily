package Array.RotateArray_189;

public class Solution {
	public void rotate(int[] nums, int k) {
		int[] temp = nums.clone();
		int index = 0;
		if(nums.length < k){
			k = k%nums.length;
		}
		for(int i = nums.length-k; i < nums.length; i++){
			nums[index] = temp[i];
			index++;
		}
		for(int i = 0; i < nums.length-k; i++){
			nums[index] = temp[i];
			index++;
		}
	}
}
