package BinaryTree.AddBinary_67;

import org.junit.Test;

public class Solution {
	public String addBinary(String a, String b) {
		//多出来一位用来放进位，最后判断一下是否需要，不需要就substring
		int alen = a.length(), blen = b.length();
		int len = ((alen>blen?alen:blen) + 1);
		int temp;
		int carry = 0;
		/**!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		 * StringBuilder之间直接赋值赋的是引用
		 * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		 */
		StringBuilder sa = new StringBuilder(a);
		StringBuilder sb = new StringBuilder(b);
		String req ;
		for(int i=0; i<len-alen; i++){
			sa.insert(0,"0");
		}
		for(int i=0; i<len-blen; i++){
			sb.insert(0,"0");
		}
		StringBuilder ans = new StringBuilder(sa.toString());
		for(int i=len-1; i>=0; i--){
			/**
			 * !!!!!!!!!!!!!!!!!!!!!!!!!!!
			 * char快速转int   char-'0'即可得
			 * !!!!!!!!!!!!!!!!!!!!!!!!!!!
			 */
			temp = (sa.charAt(i)-'0')+(sb.charAt(i)-'0');
			if(temp==0){
				ans.replace(i,i+1,carry+"");
				carry = 0;
			}else if(temp==1){
				if(carry==0){
					/**
					 * StringBuilder如果要替换某一位 他是应该 i,i+1区间，替换的是第i位
					 */
					ans.replace(i,i+1,"1");
				}else{
					ans.replace(i,i+1,"0");
					//carry = 1;
				}
			}else if(temp==2){
				if(carry==0){
					carry = 1;
					ans.replace(i,i+1,"0");
				}else if(carry==1){
					carry = 1;
					ans.replace(i,i+1,"1");
				}
			}

			if(i==0 && carry==1){
				ans.replace(i,i+1,carry+"");
			}
		}
			if(ans.charAt(0)=='0'){
				req = ans.substring(1,len);
			}else {
				req = ans.toString();
			}
			return req;
	}
	@Test
	public void main(){
		System.out.println(this.addBinary("1111","1111"));
	}
}
