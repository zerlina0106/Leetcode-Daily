package Math.PowerOfTwo_231;

public class Solution {
	public boolean isPowerOfTwo(int n) {
		while(n != 0){
			if(n%2 == 0){
				n /= 2;
			}else if(n == 1){
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
}
