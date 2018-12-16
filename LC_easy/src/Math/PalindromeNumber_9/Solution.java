package Math.PalindromeNumber_9;

public class Solution {
	public boolean isPalindrome(int x) {
		//如果是负数，那么错误
		if(x<0){
			return false;
		}
		String str = Integer.toString(x);
		StringBuilder sb = new StringBuilder(str);
		String res = sb.reverse().toString();
		if(Long.parseLong(res) > Integer.MAX_VALUE){
			return false;
		}
		if(Integer.valueOf(res).equals(x)){
			return true;
		}
		return false;

	}
}
