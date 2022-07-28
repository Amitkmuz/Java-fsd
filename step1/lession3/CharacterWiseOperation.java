package com;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CharacterWiseOperation {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		/*BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name");
		String name=br.readLine();
		System.out.println("Enter the id");
		int id=Integer.parseInt(br.readLine());
		System.out.println("Enter the salary");
		float salary=Float.parseFloat(br.readLine());
		System.out.println("Your name"+name);
		System.out.println("your id"+id);
		System.out.println("Your salary"+salary);*/
		FileReader fr=new FileReader("abc.txt");
		BufferedReader br=new BufferedReader(fr);
		FileWriter fw=new FileWriter("demo2.txt");
		String ch="";
		while(((ch=br.readLine())!=null)) {
			fw.write(ch);
		}
		fw.close();
		fr.close();
		
		

		
	}

}
