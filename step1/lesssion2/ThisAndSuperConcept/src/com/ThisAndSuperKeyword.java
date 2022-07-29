package com;
class A{
	int x =10;
	
}
class B extends A{
	int x=20;
	public void dis() {
		int x=30;
		System.out.println("x super class variable"+super.x);
		System.out.println("x super class variable"+this.x);
		System.out.println("x super class variable"+x);
		
	}
}


public class ThisAndSuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj1=new B();
		obj1.dis();

	}

}
