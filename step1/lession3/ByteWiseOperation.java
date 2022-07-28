package com;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
public class ByteWiseOperation {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//DataInputStream dis = new DataInputStream(System.in);
		/*PrintStream ps=System.out;
		ps.println("enter your name");
		String name=dis.readLine();
		ps.println("your nam is :"+name);*/
		//FileOutputStream fos=new FileOutputStream("abc.txt");
		//int ch;
		//System.out.println("Enter the data");
		//while((ch=dis.read())!='@')
		//{
			//fos.write(ch);
			
		//}
		//fos.close();
		//System.out.println("data stored");
		FileInputStream fis = new FileInputStream("abc.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		FileOutputStream fos=new FileOutputStream("demo.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		int ch;
		while((ch=bis.read())!=-1)
		{
			bos.write(ch);
			
		}
		bos.flush();
		fis.close();
		fos.close();
		System.out.println("data copied");
		

	}

}
