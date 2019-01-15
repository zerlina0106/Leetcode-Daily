package Math.CountPrimes_204;

public class Solution {
	public int countPrimes(int n) {
		//初试默认都是FALSE
		boolean[] notPrime = new boolean[n];
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (notPrime[i] == false) {
				count++;
				//从2开始依次把每个质数的倍数设置成true，乘积要比N小
				for (int j = 2; i*j < n; j++) {
					notPrime[i*j] = true;
				}
			}
		}

		return count;
	}
}
