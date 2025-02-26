package com.Hibernate_demo2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Employee_Add {
	public static void add() {
		Employee employee = new Employee();
		employee.setId(106);
		employee.setName("Ram");
		employee.setAge(24);
		employee.setSalary(1900000);

		Configuration cfg = new Configuration().configure().addAnnotatedClass(Employee.class);
//		cfg.configure();
//		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.beginTransaction();
		//
		session.save(employee);
		tran.commit();
		session.close();
		sf.close();
	}

}
