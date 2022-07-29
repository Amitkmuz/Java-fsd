package com;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee();
		emp1.setId(100);
		emp1.setName("Ramesh");
		emp1.setSalary(4000);
		
		System.out.println("id is"+emp1.getId());
		System.out.println("name is"+emp1.getName());
		System.out.println("salary is"+emp1.getSalary());
		
		Employee emp2=new Employee(101,"MAHESG",5789);
		Employee emp3=new Employee(102,"MAHEG",579);
		
		
		System.out.println("id is"+emp2.getId());
		System.out.println("name is"+emp2.getName());
		System.out.println("salary is"+emp2.getSalary());
		System.out.println(emp3);
		
		
		
		

	}

}
