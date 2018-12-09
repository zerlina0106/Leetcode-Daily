package LongestCommonPrefix_14;

import org.junit.Test;

public class Approaches {
	/**
	 *  Horizontal scanning
	 *
	 * @param strs
	 * @return
	 */
	public String longestCommonPrefix1(String[] strs) {
		if (strs.length == 0) return "";
		//先用strs[0]初始化prefix
		String prefix = strs[0];
		int j;
		//遍历字符数组
		for (int i = 1; i < strs.length; i++)
		/**
		 * 			String  indexOf()方法
		 *  int indexOf(int ch):
		 *  返回指定字符在字符串中第一次出现处的索引，如果此字符串中没有这样的字符，则返回 -1，
		 *  进入循环，将prefix截取成0到prefix.length() - 1（！！！！因为substring是左闭右开的）
		 *  如果刚好有这个prefix 而且返回的index是0 那就说明这个prefix适用，不进去，遍历下一个str[i]
		 *
		 */
			while ((j = strs[i].indexOf(prefix))  != 0) {

				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty()) return "";
			}
		return prefix;
	}

	/**
	 * Divide and conquer
	 * split the strs into two subproblem
	 * use the solutions left and right to construct the main problem
	 * @param strs
	 * @return
	 */

	public String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0) return "";
		return longestCommonPrefix(strs, 0 , strs.length - 1);
	}

	private String longestCommonPrefix(String[] strs, int l, int r) {
		if (l == r) {
			return strs[l];
		} else if (r-l == 1){
			return commonPrefix(strs[r], strs[l]);
		}
		else {
			int mid = (l + r)/2;
			String lcpLeft =   longestCommonPrefix(strs, l , mid);
			String lcpRight =  longestCommonPrefix(strs, mid + 1,r);
			return commonPrefix(lcpLeft, lcpRight);
		}
	}

	private String commonPrefix(String left,String right) {
		int min = Math.min(left.length(), right.length());
		for (int i = 0; i < min; i++) {
			if ( left.charAt(i) != right.charAt(i) )
				return left.substring(0, i);
		}
		return left.substring(0, min);
	}

	@Test
	public  void main() {
		this.longestCommonPrefix(new String[]{"cab","cadd","c"});

	}
}
