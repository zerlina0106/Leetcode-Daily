package BitManipulation.ReverseBits_190;

public class Solution {
	// you need treat n as an unsigned value
	public int reverseBits(int n) {
		if (n == 0) return 0;
		/**
		 * 反转数字，微操作，原数字最后一位如果是1 (&1是1)，结果就加一，然后原数字右移掉最后一位循环
		 */
		int result = 0;
		for (int i = 0; i < 32; i++) {
			result <<= 1;
			if ((n & 1) == 1) result++;
			n >>= 1;
		}
		return result;
	}


}
