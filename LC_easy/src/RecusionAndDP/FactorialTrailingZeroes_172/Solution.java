package RecusionAndDP.FactorialTrailingZeroes_172;

import org.junit.Test;

public class Solution {
	public int trailingZeroes(int n) {
		int count = 0;

		while(n > 0) {
			n /= 5;
			count += n;
		}

		return count;
	}

	@Test
	public void main() {
		trailingZeroes(13);
	}


}
