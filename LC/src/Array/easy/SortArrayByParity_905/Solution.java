package Array.easy.SortArrayByParity_905;

public class Solution {
	public int[] sortArrayByParity(int[] A) {
		int[] B = new int[A.length];
		int l = 0, r = A.length-1;
		for(int num : A){
			if(num % 2 == 0){
				B[l] = num;
				l++;
			}else {
				B[r] = num;
				r--;
			}
		}
		return B;
	}
}
