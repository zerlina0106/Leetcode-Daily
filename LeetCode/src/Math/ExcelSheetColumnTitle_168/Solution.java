package Math.ExcelSheetColumnTitle_168;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public String convertToTitle(int n) {

		StringBuilder sb = new StringBuilder();
		while(n>0){
			n--;
			sb.insert(0,(char)('A'+n%26));
			n /= 26;
		}
		return sb.toString();
	}
}
