package com.vinay.sorting;

/*
 * Comparable
 */
public class Point implements Comparable<Point> {
	int x,y;
	
	Point(int x,int y){
		this.x = x;
		this.y = y;
	}
	@Override
	public int compareTo(Point p) {
		// TODO Auto-generated method stub
		return this.x-p.x;
	}

	
}
/*
 * Comparator
 */
/*public class Point{
	int x,y;
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}
}*/
