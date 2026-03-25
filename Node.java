package com.aman;

public class Node {
	Object data;
	Node next;
	Node previous;
	
	Node(){}
	
	
	Node(Object obj){
		data = obj;
	}


	public Node getNext() {
		return next;
	}

	

	public Object getData() {
		return data;
	}

	public Node getPrevious() {
		return previous;
	}


	
	
}
