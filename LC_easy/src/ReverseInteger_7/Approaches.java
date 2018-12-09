package ReverseInteger_7;

public class Approaches {
	/**
	 * Intuition
	 * Pop and Push Digits & Check before Overflow
	 * build up the reverse integer one digit at a time
	 * check beforehand
	 * whether or not appending another digit would cause overflow
	 */

	/**
	 * Algorithm
	 *  repeatedly "pop" the last digit off of xx
	 *      //pop operation:
	 *        pop = x % 10;
	 *        x /= 10;
	 *
	 *  "push" it to the back of the rev
	 *      //push operation:
	 *        temp = rev * 10 + pop;  !!!!can cause overflow
	 *        rev = temp;
	 */

	public int reverse(int x) {
		int rev = 0;
		while (x != 0) {
			int pop = x % 10;
			x /= 10;
			if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
			if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
			rev = rev * 10 + pop;
		}
		return rev;
	}
}
