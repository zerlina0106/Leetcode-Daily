package Math.PowerOfFour_342;

public class Solution {
	public boolean isPowerOfFour(int num) {
		while(num%4 == 0 && num!=0){
			num /= 4;
		}
		return num == 1;
	}
}
