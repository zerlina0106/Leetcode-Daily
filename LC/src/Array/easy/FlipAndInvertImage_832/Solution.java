package Array.easy.FlipAndInvertImage_832;

import org.junit.Test;

public class Solution {
	public int[][] flipAndInvertImage(int[][] A) {
		int row = A.length;
		int column = A[0].length;
		for(int i=0; i < row; i++){
			/**
			 * 这里要注意temp每次内层循环结束要重新初始化，因为如果一直用之前的那个赋值的是引用
			 */
			int[] tempRow = new int[row];
			for(int j=0; j < column; j++){
				tempRow[j] = A[i][column-j-1];
				if(tempRow[j] == 0){
					tempRow[j] = 1;
				}else tempRow[j] = 0;
			}
			A[i] = tempRow;
		}
		return A;
	}

	@Test
	public void main() {
		int[][] A = {{1,1,0},{1,0,1},{0,0,0}};
		flipAndInvertImage(A);
	}
}
