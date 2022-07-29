package com;

import java.util.Scanner;

public class EmployeeArrayObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  obj=new Scanner(System.in);
		System.out.println("how many record do you want to store");
		int n=obj.nextInt();
		Employee employees[]=new Employee[n];
		System.out.println("Enter record one by one");
		for(int i=0;i<n;i++)
		{
			employees[i]=new Employee();
			System.out.println("enter the id");
			int id= obj.nextInt();
			employees[i].setId(id);
			System.out.println("enter the Name");
			String name=obj.next();
			employees[i].setName(name);
			System.out.println("enter the salary");
			float salary=obj.nextFloat();
			employees[i].setSalary(salary);
			
		}
		System.out.println("All employee datails are");
		for(Employee e:employees) {
			System.out.println(e);
		}
		

	}

}
