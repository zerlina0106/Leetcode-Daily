package LongestCommonPrefix_14;

import org.junit.Test;

public class Solution {
	public String longestCommonPrefix(String[] strs) {
		if(strs.length == 0){
			return "";
		}else if(strs.length == 1){
			return strs[0];
		}
		String str1 = strs[0];
		for(int i=0; i<strs.length; i++){
			if(strs[i].length()<str1.length()){
				strs[0] = strs[i];
				strs[i] = str1;
				str1 = strs[0];
			}
		}
		for(int i=0; i<str1.length(); i++){
			String prefix = str1.substring(0,i+1);
			for(int j=1; j<strs.length; j++){
				if((!strs[j].substring(0,i+1).equals(prefix))){
					prefix = str1.substring(0,i);
					return prefix;
				}
			}
			if(str1.length()==i+1){
				return prefix;
			}
		}
		return "";
	}

	@Test
	public  void main() {
		this.longestCommonPrefix(new String[]{"ca","a"});

	}
}
