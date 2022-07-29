package com;
import java.util.HashSet;
class A {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "class a";
	}
	
	
}
class B{

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "class B";
	}
	
}

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(10);
		int a=20;
		Integer b=new Integer(a);
		hs.add(b);
		hs.add(30);
		hs.add(10.10);
		hs.add("RAvi");
		hs.add(true);
		A obj1=new A();
		B obj2=new B();
		hs.add(obj1);
		hs.add(obj2);
        System.out.println(hs);
	}

}
