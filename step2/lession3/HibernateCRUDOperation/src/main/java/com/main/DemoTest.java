package com.main;

import java.util.List;

import com.bean.Employee;
import com.service.EmployeeService;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
        emp1.setId(7);
        emp1.setName("sita");
        emp1.setSalary(12000);
        
        EmployeeService es = new EmployeeService();
        String result = es.storeEmployee(emp1);
        System.out.println(result);
        
       // EmployeeService es=new EmployeeService();
        //List<Employee> listOfEmp=es.getAllEmployee();
        //for(Employee emp:listOfEmp) {
        	//System.out.println(emp);
       // }

	}

}
