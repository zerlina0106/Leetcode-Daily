package PascalsTriangle_118;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> triangle = new LinkedList<>();
		for(int i=0; i<numRows; i++){
			List<Integer> row = new ArrayList<>();
			for(int j=0; j<=i; j++){
				if(i==0) {
					row.add(j,1);
				}else {
					List<Integer> lastRow = triangle.get(i-1);
					if(j==0 || j==i){
						row.add(j,1);
					}else {
						row.add(j,lastRow.get(j)+lastRow.get(j-1));
					}
				}
			}
			triangle.add(i,row);
		}
		return triangle;
	}
}
