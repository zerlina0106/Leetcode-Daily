package ValidPatentheses_20;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
	public boolean isValid(String s) {
		Map<Character,Character> map = new HashMap<>();
		map.put(')','(');
		map.put(']','[');
		map.put('}','{');
		Stack<Character> stack = new Stack<>();
		for(int i=0; i<s.length(); i++){
			char c = s.charAt(i);
			if(stack.isEmpty()){
				stack.push(c);
			}else if(stack.lastElement().equals(map.get(c))){
				stack.pop();
			}else {
				stack.push(c);
			}
		}
		if(stack.size()==0){
			return true;
		}else
			return false;
	}
	@Test
	public void main(){
		this.isValid("()");
	}
}
