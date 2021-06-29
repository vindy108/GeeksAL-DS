package com.vinay.linkedlist;

import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.*; 

class Node2 { 
	int key; 
	int value; 
	Node2 pre; 
	Node2 next; 

	public Node2(int key, int value) 
	{ 
		this.key = key; 
		this.value = value; 
	} 
} 

class Cache { 
	private HashMap<Integer, Node2> map; 
	private int capacity, count; 
	private Node2 head, tail; 

	public Cache(int capacity) 
	{ 
		this.capacity = capacity; 
		map = new HashMap<>(); 
		head = new Node2(0, 0); 
		tail = new Node2(0, 0); 
		head.next = tail; 
		tail.pre = head; 
		head.pre = null; 
		tail.next = null; 
		count = 0; 
	} 

	public void deleteNode2(Node2 Node2) 
	{ 
		Node2.pre.next = Node2.next; 
		Node2.next.pre = Node2.pre; 
	} 

	public void addToHead(Node2 Node2) 
	{ 
		Node2.next = head.next; 
		Node2.next.pre = Node2; 
		Node2.pre = head; 
		head.next = Node2; 
	} 
 
	public int get(int key) 
	{ 
		if (map.get(key) != null) { 
			Node2 Node2 = map.get(key); 
			int result = Node2.value; 
			deleteNode2(Node2); 
			addToHead(Node2); 
			System.out.println("Got the value : " + 
				result + " for the key: " + key); 
			return result; 
		} 
		System.out.println("Did not get any value" + 
							" for the key: " + key); 
		return -1; 
	} 

	public void set(int key, int value) 
	{ 
		System.out.println("Going to set the (key, "+ 
			"value) : (" + key + ", " + value + ")"); 
		if (map.get(key) != null) { 
			Node2 Node2 = map.get(key); 
			Node2.value = value; 
			deleteNode2(Node2); 
			addToHead(Node2); 
		} 
		else { 
			Node2 Node2 = new Node2(key, value); 
			map.put(key, Node2); 
			if (count < capacity) { 
				count++; 
				addToHead(Node2); 
			} 
			else { 
				map.remove(tail.pre.key); 
				deleteNode2(tail.pre); 
				addToHead(Node2); 
			} 
		} 
	} 
} 

public class LRUCache { 
	public static void main(String[] args) 
	{ 
		
		Cache cache = new Cache(2); 

		// it will store a key (1) with value 
		// 10 in the cache. 
		cache.set(1, 10); 

		// it will store a key (2) with value 20 in the cache. 
		cache.set(2, 20); 
		System.out.println("Value for the key: 1 is " + cache.get(1)); // returns 10 

		// removing key 2 and store a key (3) with value 30 in the cache. 
		cache.set(3, 30); 

		System.out.println("Value for the key: 2 is " + 
				cache.get(2)); // returns -1 (not found) 

		// removing key 1 and store a key (4) with value 40 in the cache. 
		cache.set(4, 40); 
		System.out.println("Value for the key: 1 is " + 
			cache.get(1)); // returns -1 (not found) 
		System.out.println("Value for the key: 3 is " + 
						cache.get(3)); // returns 30 
		System.out.println("Value for the key: 4 is " + 
						cache.get(4)); // return 40 
	} 
} 
