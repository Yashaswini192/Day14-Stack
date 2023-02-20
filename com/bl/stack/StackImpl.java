package com.bl.stack;

import java.util.LinkedList;

public class StackImpl<S> {

	public Node top;
	public Node peek;
	public Node temp;
	
	public void push(S item) {
		Node<S>node = new Node(item);
		if(top == null) {
			top = node;
			return;
		}
		else {
			node.next = top;
			top = node;
		}
	}

	public void pop(S item) {
		if( top == null) {
			System.out.println("Stack is empty");
		}
		else {
			top = top.next;
		}
	}

	public void enqueue(S item) { //for adding items into queue
		Node<S>node = new Node(item);
		if(top == null) {
			top = node;
			temp = node;
		}
		else {
			temp.next = node;
			temp = node;
		}
	}
		
	public boolean isEmpty() {
		if(top == null) {
			return true;
		}else {
			return false;
		}
	}
	 
	@Override
	public String toString() {
		return "StackImpl [top=" + top + ", peek=" + peek + ", temp=" + temp + "]";
	}

}