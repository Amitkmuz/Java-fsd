package com;

public class SimpleTryAndCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		int a=10;
		int b=0;
		int abc[]= {10,20,30,40,50};
		try {
			//int res=a/b;
			//System.out.println("res is"+res);
			int res1=100/abc[3];
			System.out.println("result is"+res1);
		}
		catch(Exception e) {
			//System.out.println("I take care!");
			//System.out.println(e.getMessage());
			System.out.println(e.toString());	
		}
		System.out.println("Bye");
		System.out.println("bye");
	}

}
