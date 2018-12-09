package MaximumSubarray_53;

import org.junit.Test;

public class Approches {
	//简化成了A[0:i]从0到i之间的最大的和，必须包括A[i]
	public int maxSubArray(int[] A) {
		int n = A.length;
		int[] dp = new int[n];//dp[i] means the maximum subarray ending with A[i];
		dp[0] = A[0];
		int max = dp[0];

		for(int i = 1; i < n; i++){
			dp[i] = A[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
			max = Math.max(max, dp[i]);
		}

		return max;
	}
	@Test
	public void main(){
		int[] a = {1,2,-4,1,2,2,-2,-3,6};
		this.maxSubArray(a);
	}
}
