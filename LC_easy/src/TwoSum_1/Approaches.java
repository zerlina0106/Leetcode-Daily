package TwoSum_1;

import java.util.HashMap;
import java.util.Map;


public class Approaches {
	/**
	 * Two-pass Hash Table
	 * the best way to maintain a mapping of each element in the array to its index
	 *      A hash table.
	 *      trading space for speed
	 *      collision 冲突 degenerate 恶化 amortize 分期偿还
	 *
	 *
	 */
	public int[] twoSum2(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		//将所有的num 和 index 存入HashMap
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		// 遍历map是否包含complement
		// 并且由于每个数字只能用一次，
		// 还要加上这个complement不能是当前的这个num本身
		// 用complement的value index是否是i判断
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement) && map.get(complement) != i) {
				return new int[] { i, map.get(complement) };
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	/**
	 * One-pass Hash Table
	 * 遍历nums 然后先算出当前需要的complement
	 * 如果map以前加入的containsKey(complement)
	 * 那就直接返回
	 *      这样构造 return new int[] { map.get(complement), i }
	 * 如果没有，那就 map.put(nums[i], i);
	 */
	public int[] twoSum3(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}
}
