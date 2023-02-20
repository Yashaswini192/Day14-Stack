package com.bl.stack;

import java.util.LinkedList;

public class StackImpl<S> {

	public Node head;
	public Node temp;
	public Node tail;

	public void push(S item) {
		Node<S>node = new Node(item);
		if(head == null) {
			head = node;
			tail = node;
			return;
		}
		temp = head;
		head = node;
		head.next = temp;
	}

	@Override
	public String toString() {
		return "StackImpl [head=" + head + ", temp=" + temp + ", tail=" + tail + "]";
	}

}