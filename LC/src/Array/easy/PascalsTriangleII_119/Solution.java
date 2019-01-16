package Array.PascalsTriangleII_119;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<Integer> getRow(int rowIndex) {
		List<Integer> row = new ArrayList<>();
		for(int i=0; i<rowIndex+1; i++){
			row.add(i,1);
		}
		if(rowIndex >= 2){
			for(int i=2; i<=rowIndex; i++){
				Object[] last = row.subList(0,rowIndex).toArray();
				for(int j=1; j<i; j++){
					row.set(j,(int)last[j]+(int)last[j-1]);
				}
			}
		}
		return row;
	}
	@Test
	public void main(){
		getRow(3);
	}
}
