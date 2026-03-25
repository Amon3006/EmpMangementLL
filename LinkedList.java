package com.aman;

public class LinkedList {
	Node start,
		 end,
		 current;
	
	int count;
	
	public LinkedList(){
		start = end = current = null;
	}
	
	public LinkedList(Object data){
		Node temp = new Node(data);
		start = end = current = temp;
		count++;
	}
	
	public void add(Object data) {
		Node temp = new Node(data);
		if(start == null) {
			start = end = current = temp;
			
		}
		else {
			end.next = temp;
			temp.previous =end;
			end = temp;	
		}
		
		count++;
		
	}
	
	public void delete(int index){
		if(start == null) return;
		if(start == end) {
			start = end = current = null;
		}
		
		Node temp = start;
		
		while(index-- >0) {
			temp = temp.next;
		}
		if(temp == end) {
			end = end.previous;
			end.next = null;
		}
		
		else if(temp == start) {
			start = start.next;
			start.previous = null;
		}
		
		else {
			temp.previous.next = temp.next;
			temp.next.previous = temp.previous;
			temp = null;
		}
		
		count --;
	}
	
	
	public Object getFirst(){
		if(start == null) 
			return null;
		
		current = start;
		return current.data;
		
	}
	
	public Object getNext(){
		if(current.next == null) 
			return null;

		current = current.next;
		return current.data;
		
	}
	
	public Object getPrevious(){
		if(current.previous == null || current == start) 
			return null;
		
		current = current.previous;
		return current.data;
	}
	
	public Object getLast(){
		if(start == null) 
			return null;
		
		current = end;
		return current.data;
	}
	
	public void swapNode(Node TempNode) {
		
	}
	
	
	public int getCount() {
		return count;
	}
	
	
}
