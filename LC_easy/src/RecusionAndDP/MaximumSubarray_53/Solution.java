package RecusionAndDP.MaximumSubarray_53;

import org.junit.Test;

public class Solution {
	public int maxSubArray(int[] nums) {
		int sum = 0;
		if(nums.length == 1){
			return nums[0];
		}
		int max = Integer.MIN_VALUE;
		for(int i=0; i<nums.length; i++){
			sum = nums[i];
			//有可能算出来的比数组中原有的某个值要小
			max = Math.max(max,sum);
			for(int j=i+1; j<nums.length; j++){
				sum += nums[j];
				max = Math.max(max,sum);
			}
		}
		return max;
	}
	@Test
	public void main(){
		int[] a = {-2,1};
		this.maxSubArray(a);
	}
}
