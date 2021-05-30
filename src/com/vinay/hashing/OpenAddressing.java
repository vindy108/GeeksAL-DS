package com.vinay.hashing;

class Hashing{
	int cap,size;
	int[] arr;
	
	Hashing(int cap){
		this.cap = cap;
		size=0;
		arr = new int[cap];
		for(int i=0;i<cap;i++)
			arr[i]=-1;
	}	
	
	int hash(int key){
		return key%cap;
	}
	/*
	 * Linear probing
	 */
	boolean search(int key){
		int h = hash(key);
		int i=h;
		
		while(arr[i]!=-1){
			if(arr[i]==key)
				return true;
			i=(i+1)%cap;
			
			if(i==h)
				return false;
		}
		return false;
	}
	
	/*
	 * Linear probing
	 */
	boolean insert(int key){
		if(size==cap)
			return false;
		
		int i = hash(key);
		
		while(arr[i]!=-1 && arr[i]!=-2 && arr[i]!=key)
			i=(i+1)%cap;
		
		if(arr[i]==key)
			return false;
		else{
			arr[i]=key;
			size++;
			return true;
		}
	}
	
	/*
	 * Linear probing
	 */
	boolean erase(int key){
		int h = hash(key);
		int i=h;
		
		while(arr[i]!=-1){
			if(arr[i]==key){
				arr[i]=-2;
				return true;
			}
			i = (i+1)%cap;
			if(i==h)
				return false;
		}
		return false;
	}
	
}

public class OpenAddressing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashing mh = new Hashing(7);
	    mh.insert(49);
	    mh.insert(56);
	    mh.insert(72);
	    if(mh.search(56)==true)
	        System.out.println("Yes");
	    else
	        System.out.println("No");
	    mh.erase(56);
	    if(mh.search(56)==true)
	        System.out.println("Yes");
	    else
	        System.out.println("No");

	}

}
