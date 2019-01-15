package BitManipulation.SingleNumber_136;

import org.junit.Test;

public class Solution {
	/**
	 * N^N = 0
	 * N^0 = N
	 * @param nums
	 * @return
	 */
	public int singleNumber(int[] nums) {
		int ans = 0;
		for(int i=0; i<nums.length; i++){
			ans ^= nums[i];
		}
		return ans;
	}
	@Test
	public void main(){
		int[] a= new int[]{2, 2, 1};
		singleNumber(a);
	}
}
