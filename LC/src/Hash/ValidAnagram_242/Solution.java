package Hash.ValidAnagram_242;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
	public boolean isAnagram2(String s, String t) {

		char[] ch1 = s.toCharArray(), ch2 = t.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		String s1 = new String(ch1);
		String t1 = new String(ch2);

		return s1.equals(t1);
	}
	public Map<String,Integer> calCharSeq(String str){
		Map<String,Integer> map = new HashMap<>();
		for(int i=0; i<str.length(); i++){
			if(!map.containsKey(str.substring(i,i+1))){
				map.put(str.substring(i,i+1),1);
			}else {
				int count = map.get(str.substring(i,i+1));
				count++;
				map.put(str.substring(i,i+1),count);
			}
		}
		return map;
	}
	public boolean isAnagram(String s, String t) {
		return calCharSeq(s).equals(calCharSeq(t));
	}
}
