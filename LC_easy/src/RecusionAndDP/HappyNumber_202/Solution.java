package RecusionAndDP.HappyNumber_202;

public class Solution {
	public void loop(int n){
		String s = Integer.toString(n);
		int len = s.length();
		int ans = 0;
		for(int i=0; i<len; i++){
			ans += Math.pow(Integer.parseInt(String.valueOf(s.indexOf(i))),2);
		}
		if(ans==1) return;
		loop(ans);
	}
	public boolean isHappy(int n) {

	}
}
