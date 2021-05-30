package com.vinay.hashing;

import java.util.HashMap;
import java.util.Map;

public class HashingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> hm = new HashMap<String, Integer>();
		hm.put("Hi", 2);		//put method
		hm.put("Hello", 4);
		hm.put("ok", 2);
		
		System.out.println(hm);
		System.out.println(hm.size());//size method
		
		for(Map.Entry<String, Integer> e: hm.entrySet()){  //iterator
			System.out.println(e.getKey() + " " + e.getValue());
		}
		
		if(hm.containsKey("Hi")){			//containsKey method
			System.out.println("yes");
		}else
			System.out.println("no");
		
		hm.remove("ok");//remove method
		
		System.out.println(hm.size());// size method
		
		if(hm.containsValue(4)){		//containsValue method
			System.out.println("yes");
		}else
			System.out.println("no");
		
		System.out.println(hm.get("Hello"));//get method
		System.out.println(hm.get("ok"));
		
		

	}

}
