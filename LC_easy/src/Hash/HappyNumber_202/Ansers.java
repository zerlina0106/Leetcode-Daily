package Hash.HappyNumber_202;

import java.util.HashSet;
import java.util.Set;

public class Ansers {
	public boolean isHappy(int n) {
		Set<Integer> inLoop = new HashSet<Integer>();
		int squareSum,remain;
		/**
		 * public boolean add(Object obj)方法用在Set添加元素时，如果元素值重复时返回 "false"，如果添加成功则返回"true"
		 */
		while(inLoop.add(n)){
			squareSum = 0;
			while(n > 0) {
				remain = n%10;
				squareSum += remain*remain;
				n /= 10;
			}
			if(squareSum == 1){
				return true;
			}else n = squareSum;
		}
		return false;
	}
}
