package BitManipulation.NumberOf1Bits_191;

import org.junit.Test;

public class Solution {
	public int hammingWeight(int n) {
		int ans = 0;
		if(n==0) return 0;
		for(int i=0; i<32; i++){
			if((n&1) == 1){
				ans++;
			}
			/**
			 * 不会移动符号位，所以循环的判断只能根据位数是否都被操作过了
			 */
			n >>= 1;
		}
		return ans;
	}


}
