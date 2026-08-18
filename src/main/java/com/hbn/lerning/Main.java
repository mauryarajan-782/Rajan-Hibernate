package com.hbn.lerning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hbn.lerning.entity.Employee;

public class Main {

	public static void main(String[] args) {
	
		
		Employee emp = new Employee("ansh", "male",99000);
		
//		Configuration cfg = new Configuration().configure("hibernate.cfgg.xml");
//		SessionFactory sessionFactory = HinbernateConfig.getSessionFactory();
		
		Session session =  HinbernateConfig.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();

		
		session.persist(emp);
		
		transaction.commit();
	}

}
