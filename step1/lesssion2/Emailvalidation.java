package com;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Emailvalidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner obj =new Scanner(System.in);
	        ArrayList<String> emails = new ArrayList<String>(); 
	        System.out.println("Enter the email id :");
	        emails.add(obj.nextLine());
	          
	        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";  
	         
	        Pattern pattern = Pattern.compile(regex);  
	         
	        for(String email : emails){  
	               
	            Matcher matcher = pattern.matcher(email);  
	            System.out.println(email +" : "+ matcher.matches()+"\n");  
	        }  

	}

}
