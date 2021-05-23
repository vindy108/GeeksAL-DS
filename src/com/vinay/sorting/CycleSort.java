package com.vinay.sorting;

public class CycleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={20,40,50,10,30};
		cycleDistinctSort(arr);
		for(int x:arr){
			System.out.print(x + " ");
		}

	}
	
	/*
	 * Cycle sort
	 */
	public static void cycleDistinctSort(int[] arr){
		int n =arr.length;
		for(int cs=0;cs<n-1;cs++){ 
			int item = arr[cs];  //20 ,20,50
			int pos = cs;		 //0,1,2	
			for(int i=cs+1;i<n;i++)
				if(arr[i]<item)	
					pos++;		//1	,4
				
				int temp=item;	//swap(item,arr[pos])
				item=arr[pos];   //item=40 ,30
				arr[pos]=temp;//20,20,50,10,30:10,20,50,40,50
			
			
			while(pos!=cs){
				pos=cs;			//0
				for(int i=cs+1;i<n;i++)
					if(arr[i]<item)//item=40 , 10 ,30
						pos++; //3 ,0 ,2
					
					temp=item;//swap(item,arr[pos])
					item=arr[pos];//item=10	,20	,50		
					arr[pos]=temp;//20,20,50,40,30:10,20,50,40,30:10,20,30,40,50
				}
			}
		}
	}
