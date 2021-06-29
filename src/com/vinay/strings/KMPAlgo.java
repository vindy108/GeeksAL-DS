package com.vinay.strings;

public class KMPAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "ababacab";
		String patt="aba";
		matchKMP(str, patt);

	}
	
	/*
	 * Naive sol
	 */
	public void fillLPSNaive(String str, int[] lps){
		for(int i=0;i<str.length();i++)
			lps[i]=longestPreSuf(str,i+1);
	}
	
	public int longestPreSuf(String str, int n) {
		// TODO Auto-generated method stub
		for(int len=n-1;len>0;len--){
			boolean flag=true;
			for(int i=0;i<len;i++){
				if(str.charAt(i)!=str.charAt(n-len+i))
					flag=false;
				if(flag==true)
					return len;
			}
		}
		return 0;
	}
	
	/*
	 * Eff app:
	 */
	public static void fillLPSEff(String str,int[] lps){
		int n = str.length(),len=0;	//initilaize len=0,lps[0]=0,i=1;
		lps[0]=0;
		int i=1;
		
		while(i<n){
			if(str.charAt(i)==str.charAt(len)){//if char match , then increment len, lps[i]=len then i++
				len++;
				lps[i]=len;
				i++;
			}
			else{
				if(len==0){		//if len=0, then assign lps[i]=0 and i++
					lps[i]=0;
					i++;
				}else{		//if len >0, then len = lps[len-1];
					len = lps[len-1];
				}
			}
		}
	}
	
	
	public static void matchKMP(String str, String patt){
		int m = str.length();
		int n = patt.length();
		
		int lps[]=new int[n];
		fillLPSEff(patt, lps);
		
		int i=0,j=0;
		
		while(i<m){
			if(patt.charAt(j)==str.charAt(i)){
				i++;
				j++;
			}
			if(j==n){
				System.out.print(i-j + " ");
				j=lps[j-1];
			}
			else if(i<m && patt.charAt(j) != str.charAt(i)){
				if(j==0)
					i++;
				else
					j=lps[j-1];
			}
		}
		
	}
	
	

}
