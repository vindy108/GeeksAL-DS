package com.vinay.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(2);
		list.add(10);
		list.add(4);
		
		 * Natural order
		 
		Collections.sort(list);
		System.out.println(list);
		
		
		 * Reverse order
		 
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);*/
		
		/*
		 * Using Comparable
		 */
		
		/*List<Point> list = new ArrayList<Point>();
		list.add(new Point(5,10));
		list.add(new Point(2,20));
		list.add(new Point(10,30));
		Collections.sort(list);
		
		for(Point p : list){
			System.out.println(p.x + " " + p.y);
		}*/
		
		/*
		 * Using Comparator
		 */
		
		List<Point> list = new ArrayList<Point>();
		list.add(new Point(5,10));
		list.add(new Point(2,20));
		list.add(new Point(10,30));
		Collections.sort(list,new MyComparator());
		
		for(Point p : list){
			System.out.println(p.x + " " + p.y);
		}
		
	}

}
