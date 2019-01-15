package Array.IsomorphicStrings_205;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public StringBuilder getStr(String s){
		StringBuilder sb = new StringBuilder();
		Map<String, Integer> map = new HashMap<>();
		for(int i=0; i < s.length(); i++){
			if(map.containsKey(s.substring(i,i+1))){
				break;
			}else {
				map.put(s.substring(i,i+1),map.size());
			}
		}
		for(int i=0; i < s.length(); i++){
			if(map.containsKey(s.substring(i,i+1))){
				sb.append(map.get(s.substring(i,i+1)));
			}
		}
		return sb;
	}
	public boolean isIsomorphic(String s, String t) {
		StringBuilder ss = getStr(s);
		StringBuilder st = getStr(t);
		if(ss.toString().equals(st.toString())){
			return true;
		}else return false;
	}

	@Test
	public void main() {
		isIsomorphic("egg","add");
	}
}
