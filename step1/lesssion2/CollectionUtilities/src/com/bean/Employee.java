package com.bean;

public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private float salary;
	public Employee() {
		super();
	}
	public Employee(int id,String name,float salary) {
		super();
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public int compareTo(Employee o) {
		//return this.id-o.id;
		//return o.id-this.id;					// id wise desc order
		//return (int)(this.salary-o.salary);			// salary wise - asc
		//return (int)(o.salary-this.salary);        // salary wise - desc 
		//return this.name.compareTo(o.name);   // name wise asc 
		return o.name.compareTo(this.name);    // name wise de
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	

}
