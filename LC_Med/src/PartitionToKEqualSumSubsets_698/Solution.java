package PartitionToKEqualSumSubsets_698;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
	public boolean canPartitionKSubsets(int[] nums, int k) {
		if(nums.length == 0) return false;
		int sum = 0;
		//  num值    个数
		Map<Integer,Integer> map  = new HashMap<>();
		Map<Integer,Integer> mapSet  = new HashMap<>();

		for(int num : nums){
			sum += num;
			if(map.containsKey(num)){
				map.put(num,map.get(num)+1);
			}
			map.put(num,1);
		}
		if((sum % k)!=0){
			return false;
		}
		sum = sum/k;
		int sumTemp = sum;
		if(map.containsKey(sum)){
			//有几个和map相等就减去几组
			k -= map.get(sum);
			//防止remove以后循环出问题，所以这里用0个
			map.put(sum,0);
		}
		for(int key : map.keySet()){
			if(key>sum) return false;
			mapSet.put(key,map.get(key)-1);
			if()

		}






	}
}
