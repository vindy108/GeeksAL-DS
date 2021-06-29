package com.vinay.strings;

public class CheckStringRotataion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "ABCD";
		String str2 = "CDAB";
		System.out.println(isStringRotation(str1, str2));
				
	}
	
	public static boolean isStringRotation(String str1, String str2){
		if(str1.length()!=str2.length())
			return false;
		return((str1+str1).indexOf(str2) >=0);	// concat the first string withitself and check for second string index present
	}

}
