package Array.easy.FirstBadVersion_278;

public class Solution {
	public int firstBadVersion(int n) {
		for(int i=1; i<=n; i++){
			if(!isBadVersion(i)){
				return i;
			}
		}
		return -1;
	}

	private boolean isBadVersion(int n) {
		return true;
	}
}
