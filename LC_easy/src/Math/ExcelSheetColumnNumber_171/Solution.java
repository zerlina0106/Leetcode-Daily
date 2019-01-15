package Math.ExcelSheetColumnNumber_171;

import org.junit.Test;

public class Solution {
	public int titleToNumber(String s) {
		if(s.length()==0) return 0;
		StringBuilder sb = new StringBuilder(s);
		int count = 0;
		int ans = 0;
		char c;
		for(int i=sb.length()-1; i>=0; i--){
			c = sb.charAt(i);
			if(i==sb.length()-1){
				ans += (((int)c-65)%26+1);
				count++;
			}else {
				ans += (((int)c-65)%26+1)*Math.pow(26,count);
				count++;
			}
		}
		return ans;
	}
	@Test
	public void main(){
		titleToNumber("ABA");
	}
}




