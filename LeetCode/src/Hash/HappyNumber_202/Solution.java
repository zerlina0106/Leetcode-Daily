package Hash.HappyNumber_202;


public class Solution {
	public int calAns(int n){
		int ans = 0;
		while(n > 0){
			ans += Math.pow(n%10,2);
			n = n/10;
		}
		return ans;
	}

	public boolean isHappy(int n) {
		int x = n;
		int y = n;
		while(x > 1){
			x = calAns(x);
			if(x == 1)  return true;
			y = calAns(calAns(y));
			if(y == 1)  return true;

			if(x == y)  return false;
		}
		return true;
	}
}

