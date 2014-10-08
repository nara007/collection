package com.sy.linklist;

public class Node 
{
	private Object obj;
	private Node next;
	
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	
	public Node(Object obj, Node next) 
	{
		super();
		this.obj = obj;
		this.next = next;
	}
	
	
}
