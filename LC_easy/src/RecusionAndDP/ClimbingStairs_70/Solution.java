package RecusionAndDP.ClimbingStairs_70;

public class Solution {
	public int climbStairs(int n) {
		if(n==1){
			return 1;
		}
		//dp[i]是达到第i层台阶的ways数量
		//dp[i]=dp[i-1]+dp[i-2]
		int[] dp = new int[n+1];
		dp[1] = 1;
		dp[2] = 2;
		for(int i=3; i<=n; i++){
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[n];
	}
}
