package com.vinay.arrays;

public class StockBuyAndSell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,5,3,8,12};
		//System.out.println(stockBuySellNaive(arr,0,4));
		System.out.println(stockBuySellEff(arr));
	
	}
	
	/*
	 * Naive approach
	 */
	public static int stockBuySellNaive(int[] arr,int start,int end){
				
		if(end <= start) //if there is one element , then profit is zero for the day
			return 0;
		int profit=0;
		
		for(int i=start;i<end;i++){			// to find the max profit bw the elements, comparing each
			for(int j=i+1;j<=end;j++){	// element to the consecutive
				if(arr[j]>arr[i]){
					int curr_profit = arr[j]-arr[i]+ // find the diff {(5-1)+stock..(arr,0,-1)+stock..(arr,2,4)=(12-3)=9
					stockBuySellNaive(arr,start,i-1)+stockBuySellNaive(arr,j+1,end);// max of the left and right elements
				profit = Math.max(curr_profit, profit); // Max profit is found for every curr_profit
				}
			}
		}
		return profit;
	}
	
	/*
	 * Eff approach
	 */
	public static int stockBuySellEff(int[] arr){
		int n = arr.length;					//int[] arr={1,5,3,8,12};
		int profit=0;
		for(int i=1;i<n;i++){		
			if(arr[i] > arr[i-1]){			// compare if next element value is greater than current value
				profit += arr[i]-arr[i-1];	// then cumulatively add the profit and diff of value
			}
		}
		return profit;
		
	}

}
