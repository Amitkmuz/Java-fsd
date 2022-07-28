package com;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack ss=new Stack();
		ss.push(100);
		ss.push(200);
		ss.push(300);
		ss.push(400);
		System.out.println(ss);
		System.out.println(ss.pop());
		System.out.println(ss);
		System.out.println(ss.peek());
		System.out.println(ss);
		System.out.println(ss.search(100));
		System.out.println(ss.search(1000));
		

	}

}
