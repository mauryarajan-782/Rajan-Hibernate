package com.hbn.learning;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hbn.learning.entity.Employee;

public class Main {

	public static void main(String[] args) {


		Employee emp1 = new Employee("Ashish", "male", 99000,"HCL");
		

		Session session = HinbernateConfig.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();

//		session.persist(emp1);
//		transaction.commit();

		
		Employee employee = session.find(Employee.class, 35);
		System.out.print(employee);
		
		
		session.load(emp1, 35);
		System.out.println(emp1);
	}

}
