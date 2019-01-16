package Array.easy.TwoSumII_167;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int[] twoSum(int[] numbers, int target) {
		int l=0,r=numbers.length-1;
		while(numbers[l] + numbers[r] != target){
			if(numbers[l]+numbers[r] > target) r--;
			else l++;
		}
		return new int[]{l+1,r+1};
	}
	@Test
	public void main(){
		int[] a = {2,3,4};
		twoSum(a,6);
	}
}
