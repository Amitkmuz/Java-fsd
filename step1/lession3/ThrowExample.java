package com;
class MyException extends Exception{
	public MyException(){
		
	}
	public MyException(String msg) {
		super(msg);
	}
}

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=5;
		try {
			if(a>b) {
				throw new MyException("a>b");
			}
			else {
				
				System.out.println("No");
			}
		}
		catch(Exception e) {
			
			//System.out.println(e.toString());
			System.out.println(e);
		}

	}

}
