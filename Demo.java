package com.aman;

public class Demo {
public static void main(String ...strings ) {
	
	LinkedList l1 = new LinkedList("hello");
	
	
	l1.add("hello 2");
	l1.add("hello 3");
	l1.add("hello 4");
	
	int i =4;
	while(i-->0)
	System.out.println(l1.getNext());
	
	
	
	
}
}
