
class Info implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread tt=Thread.currentThread();
		String name=tt.getName();
		for(int i=0;i<10;i++)
		{
			
			try {
				System.out.println(name+"="+i);
				Thread.sleep(500);
				if(i==5 && name.equals("Ravi")) {
					wait();
				}
				if(i==4 && name.equals("vijay")) {
					notify();
					wait();
				}
			}
			catch(Exception e) {
				
			}
		}
		
	}
	
}
public class InnerThreadCommunication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Info obj=new Info();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		Thread t3=new Thread(obj);
		
		t1.setName("Ravi");
		t2.setName("Ajay");
		t3.setName("vijay");
		
	    t1.start();
	    t2.start();
	    t3.start();

	}

}
