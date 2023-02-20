package com.bl.stack;

public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackImpl<Integer> S1 = new StackImpl();
		//Stack Operations:
		System.out.println("Stack Operations:");
		S1.push(70);
		System.out.println(S1.toString());

		S1.push(30);
		System.out.println("\n"+S1.toString());

		S1.push(56);
		System.out.println("\n"+S1.toString());

		S1.pop(56);
		System.out.println("\n"+S1.toString());
 
		S1.pop(30);
		System.out.println("\n"+S1.toString());

		S1.pop(70);
		System.out.println("\n"+S1.toString());
		S1.pop(45);

		
		//Queue Operations:
		System.out.println("Queue Operations:");
		S1.enqueue(56);
		System.out.println("\n"+S1.toString());
		
		S1.enqueue(30);
		System.out.println("\n"+S1.toString());
		
		S1.enqueue(70);
		System.out.println("\n"+S1.toString());
		
		S1.isEmpty();
		System.out.println("\n "+S1.isEmpty());
		
		
		
	}
}
