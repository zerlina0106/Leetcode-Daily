package Array.MajorityElement_169;

import org.junit.Test;

import java.util.*;

public class Solution {
	public int majorityElement(int[] nums) {
		/**map key: the value of the element
		 *     value: the frequency of the element
		 */
		Map<Integer, Integer> map = new TreeMap<>();
		for (int num : nums) {
			if (map.containsKey(num)) {
				int count = map.get(num);
				count++;
				map.put(num, count);
			} else {
				map.put(num, 1);
			}
		}
		List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
			@Override
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		return list.get(list.size()-1).getKey();

	}
	@Test
	public void main(){
		int[] nums = {3,3,4};
		majorityElement(nums);
	}
}
