package String.WordPattern_290;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public boolean wordPattern(String pattern, String str) {
		Map<String,String> map = new HashMap<>();
		if(pattern.equals("")) return false;
		String[] patterns = pattern.split("");
		String[] strings = str.split(" ");
		if(strings.length != patterns.length) return false;
		for(int i=0; i<patterns.length; i++){
			if((!map.containsKey(patterns[i]) && !map.containsValue(strings[i]))){
				map.put(patterns[i],strings[i]);
			}
		}
		for(int j=0; j<strings.length; j++){
			if(!strings[j].equals(map.get(patterns[j]))){
				return false;
			}
		}
		return true;
	}
}
