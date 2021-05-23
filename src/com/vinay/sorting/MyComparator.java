package com.vinay.sorting;

import java.util.Comparator;

/*
 *  comparator
 */
public class MyComparator implements Comparator<Point> {

	@Override
	public int compare(Point p1, Point p2) {
		// TODO Auto-generated method stub
		return p1.x-p2.x;
	}

}

/*
 * Wrapper class
 */
/*public class MyComparator implements Comparator<Integer>{
	
	public int compare(Integer a, Integer b){
		return a%2 - b%2;
	}
	
}*/
