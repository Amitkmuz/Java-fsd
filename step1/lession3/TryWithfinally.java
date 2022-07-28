package com;

public class TryWithfinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int res=10/0;
			System.out.println("no exception");
		}
		finally {
			System.out.println("finally block ");
		}
		System.out.println("Normally");

	}

}
