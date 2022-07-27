
import java.util.*;

class Outer {

	
	private static void outerMethod()
	{

		
		System.out.println("inside outerMethod");
	}

	
	
	static class Inner {

		public static void display()
		{

			
			System.out.println("inside inner class Method");

			
			outerMethod();
		}
	}
}


class InnerExample {

	
	public static void main(String args[])
	{

		Outer.Inner obj = new Outer.Inner();

		
		obj.display();
	}
}
