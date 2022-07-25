class TypeCasting {
	public static void main(String args[]) {
		/*byte a=10;
		short b=a;		//implicit type casting 
			System.out.println(a);
			System.out.println(b);

		short c=10;
		byte d =(byte)c;		// explicit type casting 

			System.out.println(c);
			System.out.println(d);*/
			
			//float x = 100.10;		// error 
			//float x = (float)100.10;
			//float x = 100.10f;
			//double x = 100.10;
			float x = 100.10f;
			int y = (int)x;			// explicit type casting 	
			System.out.println(x);
			System.out.println(y);
	}
}
