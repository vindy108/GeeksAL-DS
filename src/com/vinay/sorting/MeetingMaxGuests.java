package com.vinay.sorting;

import java.util.Arrays;

public class MeetingMaxGuests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {900,600,700};
		int [] dep = {1000,800,730};
		
		System.out.println(meetingGuests(arr,dep));

	}

	
	public static int meetingGuests(int[] arr,int[] dep){
		int n = arr.length;
		
		Arrays.sort(arr);		// sort the arrival time
		Arrays.sort(dep);		// sort the departure time
		
		int i=1,j=0,res=1,cur=1;	// i represents arrival, j represents departure, res and cur=1, since arrived
		
		while(i<n && j<n){
			if(arr[i]<=dep[j]){   // if next person arrival time is less than prev person departure
				cur++;				// increment the meeting count
				i++;				// check for next person
			}else{
				cur--;				// else decrement the meeting count
				j++;
			}
			res = Math.max(res, cur);	// find the max of persons met
			
		}
		
		return res;
	}
}
