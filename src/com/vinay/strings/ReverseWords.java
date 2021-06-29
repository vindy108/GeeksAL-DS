package com.vinay.strings;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "geeks for Geekss";
		char[] ch = str.toCharArray(); // convert string to char array to perform mutations
		reverseWords(ch);
		System.out.println(ch);

	}

	public static void reverseWords(char[] ch){
		int n = ch.length;
		int start =0;		
		
		for(int end=0;end<n;end++){			// loop through the entire sentence
			if(ch[end]==' '){			// when we reach space
				reverse(ch,start,end-1);	//perform reverse from start to end-1
				start = end+1;				// for the next word, start, end+1
			}				
		}
		
		reverse(ch,start,n-1);		// the last word should be reversed  start to n-1
		reverse(ch,0,n-1);			// entire sentence is reversed
	}

	public static void reverse(char[] ch, int low, int high) {
		// TODO Auto-generated method stub
		
		while(low <= high){				// reverse function which performs swap
			//swap(ch[low],ch[high])
			char temp = ch[low];
			ch[low] = ch[high];
			ch[high]=temp;
			
			low++;
			high--;
		}
		
	}
}
