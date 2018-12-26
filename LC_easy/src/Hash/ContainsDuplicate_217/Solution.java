package Hash.ContainsDuplicate_217;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
	public boolean containsDuplicate(int[] nums) {
		if(nums.length == 0 )return false;
		Set<Integer> set = new HashSet<>();
		for(int num : nums){
			if(!set.add(num)){
				return true;
			}
		}
		return false;
	}
}
