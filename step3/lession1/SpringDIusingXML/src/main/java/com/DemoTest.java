package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Employee emp1=new Employee();
		//emp1.display();
		
		Resource rs=new ClassPathResource("beans.xml");
		BeanFactory bb=new XmlBeanFactory(rs);
		//Employee employee1=(Employee)bb.getBean("emp1");
		//employee1.display();
		
		//Employee employee3=(Employee)bb.getBean("emp1");
		//employee3.display();
		
		//Employee employee2=(Employee)bb.getBean("emp2");
		//employee2.display();
		
		//Employee employee4=(Employee)bb.getBean("emp2");
		//employee4.display();
		
		//Employee employee5=(Employee)bb.getBean("emp1");
		//System.out.println(employee5);
		
		//Employee employee6=(Employee)bb.getBean("emp3");
		//System.out.println(employee6);
		
		//Employee employee7=(Employee)bb.getBean("emp6");
		//System.out.println(employee7);
		
		//Address address1=(Address)bb.getBean("add1");
		//System.out.println(address1);
		
		//Employee employee8=(Employee)bb.getBean("emp7");
		//System.out.println(employee8);
		
		Employee employee9=(Employee)bb.getBean("emp8");
		System.out.println(employee9);
		

	}

}
