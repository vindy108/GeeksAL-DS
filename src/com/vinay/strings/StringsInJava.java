package com.vinay.strings;

public class StringsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "geeksforgeeks";
				
		System.out.println(str.length());// returns the length of the string
		System.out.println(str.charAt(2));// print the char at index
		System.out.println(str.substring(4));// reads from start
		System.out.println(str.substring(4, 10));// reads string from start to end-1
		
		//Literals
		String str1 = "geeks";
		String str2 = "geeks";
		
		if(str1==str2)					// checks if both referring to same object
			System.out.println("yes");
		else
			System.out.println("no");
		
		String str3 = new String("geeks");
		
		if(str1==str3)
			System.out.println("yes");
		else
			System.out.println("no");
		
		//Contains		
		System.out.println(str.contains(str1));// checks if the str value is present
		
		//Equals
		System.out.println(str1.equals(str3));// checks for equality in characters
		
		//compareTo
		String str4 = "for";		//compares the string lexicographically, prints the output based on greater
		
		int res = str.compareTo(str4);
		System.out.println(res);
		
		if(res==0)
			System.out.println("same");
		if(res >0)
			System.out.println("s1 is greater");
		if(res<0)
			System.out.println("s2 is greater");
		
		//indexOf		
		int out = str.indexOf(str4);// prints the index of first occurrence else return negative
		System.out.println(out);
		
		System.out.println(str.indexOf(str1,1));// checks for the next occurrence, since it starts to search from index 1
		
		//concat
		System.out.println(str1==str2);// both are referring to same object
		str1 = str1.concat("forgeeks");
		System.out.println(str1);
		
		System.out.println(str1==str2); // after concat, str1 is referring to new object since immutable
		System.out.println(str1==str3);
		

	}

}
