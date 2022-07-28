package com;

public class FinallyBlockExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		try{
			int res=10/0;
			System.out.println("no exception");
		}
		catch(Exception e) {
			System.out.println("catch block");
		}
		finally {
			System.out.println("finally block ");
		}
		System.out.println("Hi");
	}

}
