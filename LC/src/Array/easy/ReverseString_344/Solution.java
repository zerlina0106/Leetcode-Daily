package Array.easy.ReverseString_344;

public class Solution {
	public void reverseString(char[] s) {
		for(int i=0; i<s.length/2; i++){
			int l = s[i], r = s[s.length-i-1];
			s[i] -= (l-r);
			s[s.length-i-1] += (l-r);
		}
	}
}
