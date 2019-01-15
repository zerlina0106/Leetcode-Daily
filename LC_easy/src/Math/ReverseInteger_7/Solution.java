package Math.ReverseInteger_7;

import org.junit.Test;

public class Solution {

	public int reverse(int x) {
		/**
		 * Math.abs(Integer.MIN_VALUE);  //-2147483648
		 * Math.abs(Long.MIN_VALUE);  //-9223372036854775808
		 * Math.abs(int)返回的是一个int值。
		 * 但是2147483648已经不是Integer的范围所能表示的了。硬用int来表示，就变成负数了
		 */
		long temp = Math.abs((long)x);
		String str = Long.toString(temp);
		StringBuilder stringBuilder = new StringBuilder(str);
		String ans = stringBuilder.reverse().toString();
		if(Long.parseLong(ans) < Integer.MAX_VALUE){
			if(x<0){
				return -Integer.parseInt(ans);
			}else{
				return Integer.parseInt(ans);
			}
		}else {
			return 0;
		}
	}

	@Test
	public void main() {
		this.reverse(
				-2147483648);
	}
}
