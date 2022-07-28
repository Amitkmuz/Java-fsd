package com;
class Booking implements Runnable{
	int avl=1;

	@Override
	public synchronized void run() {
		Thread t =Thread.currentThread();
		String name=t.getName();
		if(avl==1) {
			System.out.println(name+"got the ticket");
			avl=avl-1;
		}else {
			System.out.println("sorry no ticket");
		}
		
		// TODO Auto-generated method stub
		
	}
	
}

public class BookingTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Booking b1= new Booking();
		Thread t1=new Thread(b1);
		Thread t2=new Thread(b1);
		Thread t3=new Thread(b1);
		t1.setName("Rajesh");
		t2.setName("Raman");
		t3.setName("Mahesh");
		t1.start();
		t2.start();
		t3.start();

	}

}
