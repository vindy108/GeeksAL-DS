package com.vinay.sorting;

public class CountInversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = new int[] {2,4,1,3,5};
		//System.out.print(countInversionNaive(arr));
		int[] arr={2,5,8,11,3,6,9,13};
		System.out.print(countInversionEff(arr,0,7));

	}
	
	/*
	 * Naive sol
	 */
	public static int countInversionNaive(int[]a){
		int n = a.length;
		int res=0;
		for(int i=0;i<(n-1);i++){
			for(int j=i+1;j<n;j++){ // to check if given element is greater than the cons elements
				if(a[i]>a[j])
					res++;
			}
		}
		return res;
	}
	
	/*
	 * Eff sol
	 */
	
	public static int countInversionEff(int[]a,int l,int h){
		int res = 0;
		if(l < h){
			int m = (l+h)/2;
			res += countInversionEff(a,l,m);
			res += countInversionEff(a,m+1,h);
			res += countInversionMerge(a,l,m,h);
		}
		return res;
	}

	public static int countInversionMerge(int[] a, int l, int m, int h) {
		// TODO Auto-generated method stub
		int n1 = m-l+1;
		int n2 = h-m;
		
		int[] left = new int[n1];		// same as merge logic
		int[] right = new int[n2];
		
		for(int i=0;i<n1;i++){
			left[i] = a[l+i];
		}
		
		for(int j=0;j<n2;j++){
			right[j] = a[m+1+j];
		}
		
		int i=0,j=0,k=l,res=0;
		
		while(i<n1 && j<n2){
			if(left[i]<=right[j]){
				a[k++]=left[i++];				
			}else{
				a[k++]=right[j++];
				res = res+(n1-i);			// calculating the res
			}		
		}
		
		while(i<n1){
			a[k++]=left[i++];			
		}
		while(j<n2){
			a[k++]=right[j++];			
		}
		return res;
	}

}
