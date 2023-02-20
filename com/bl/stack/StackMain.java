package com.bl.stack;

public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackImpl<Integer> S1 = new StackImpl();
		S1.push(70);
		System.out.println(S1.toString());
		S1.push(30);
		System.out.println("\n"+S1.toString());
		S1.push(56);
		System.out.println("\n"+S1.toString());
		
	}

}
