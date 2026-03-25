// package com.aman;

public class Node {
	Object data;
	Node next;
	Node previous;
	
	Node(){}
	
	
	Node(Object obj){
		data = obj;
	}


	public Object getData() {
		return data;
	}


	public void nodeSetData(Object obj){
		data = obj;
	}
	
	
}
