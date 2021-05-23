package com.vinay.search;

public class RepeatingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr = {0,1,2,3,5,2,4};
		//System.out.println(repeatingEleEff(arr));
		System.out.println(repeatingEleSuper(arr));

	}
	
	/*
	 * Eff app
	 */
	public static int repeatingEleEff(int[]arr){
		int n = arr.length;
		boolean [] visit = new boolean[n]; // assign boolean values
		
		for(int i=0;i<n;i++){
			if(visit[arr[i]])		// if the array value is already true
				return arr[i];		// return the element
			visit[arr[i]]=true;		// else mark the element as true
		}
		return -1;					// if no repeating, return -1
	}
	
	public static int repeatingEleSuper(int[] arr){
		int n= arr.length;
		int slow = arr[0]+1, fast=arr[0]+1;
		
		do{
			slow = arr[slow]+1;
			fast = arr[arr[fast]+1]+1;
		} while(slow != fast);
			
			slow = arr[0]+1;
		while(slow!=fast){
			slow = arr[slow]+1;
			fast=arr[fast]+1;
		}
		return slow-1;
		}
	}


