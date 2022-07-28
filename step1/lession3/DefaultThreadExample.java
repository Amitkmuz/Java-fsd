package com;

public class DefaultThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		Thread t=Thread.currentThread();
		System.out.println(t);
		String name=t.getName();
		int i =t.getPriority();
		System.out.println(name);
		System.out.println(i);
		t.setPriority(2);
		t.setName("my thraed");
		System.out.println(t);
		t.setPriority(Thread.MIN_PRIORITY);
		System.out.println(t);

	}

}
