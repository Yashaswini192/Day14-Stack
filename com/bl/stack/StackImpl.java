package com.bl.stack;

import java.util.LinkedList;

public class StackImpl<S> {

	public Node top;
		
	public Node peek;

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

	@Override
	public String toString() {
		return "StackImpl [top=" + top + "]";
	}

}