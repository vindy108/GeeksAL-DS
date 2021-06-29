package com.vinay.strings;

public class LexicoGraphicRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="string";
		System.out.println(lexicoGraphicRank(str));

	}
	
	static int CHAR=256;
	public static int lexicoGraphicRank(String str){
		int res=1;
		int n = str.length();
		int mul = fact(n);		// calculate the fact of the string
		int count[] = new int[CHAR];
		
		for(int i=0;i<n;i++)
			count[str.charAt(i)]++;	// assign the count to each char for the string
		
		for(int i=1;i<CHAR;i++)
			count[i] +=count[i-1];// increment the count for conse chars
		
		for(int i=0;i<n-1;i++){
			mul = mul/(n-i);							
			res = res+count[str.charAt(i)-1]*mul;	//calculate the res
			for(int j=str.charAt(i);j<CHAR;j++)
				count[j]--;		
		}
		return res;
		
	}
	public static int fact(int n) {
		// TODO Auto-generated method stub
		if(n==0)
			return 1;
		
		return n*fact(n-1);
	}

}
