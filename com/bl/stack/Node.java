package com.bl.stack;


public class Node<S>{
	S item;
	Node next;
	
	public Node(S item) {
		super();
		this.item = item;
		this.next = null;
	}

	@Override
	public String toString() {
		return "Node [item=" + item + ", next=" + next + "]";
	}


}
