// package com.aman;

public class Demo {
public static void main(String ...strings ) {
	
	LinkedList l1 = new LinkedList();
	
	
	l1.add(2);
	l1.add(1);
	l1.add(4);
	
	Integer e = (int) l1.getFirst();
	while(e != null){
	
	System.out.println(e);
	e = (int) l1.getNext();}
}
}
