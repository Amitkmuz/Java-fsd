package com;
class Task implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread tt=Thread.currentThread();
		String name=tt.getName();
		for(int i=0;i<10;i++)
		{
			System.out.println(name+"="+i);
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				
			}
		}
		
	}
	
}

public class MultipleThreadDoingSameTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread tt=Thread.currentThread();
		Runnable t =new Task();
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		Thread t3=new Thread(t);
		System.out.println(tt);
		t1.setName("first thread");
		t2.setName("second thread");
		t3.setName("third thread");
		
	    t1.start();
	    t2.start();
	    t3.start();
		

	}

}
