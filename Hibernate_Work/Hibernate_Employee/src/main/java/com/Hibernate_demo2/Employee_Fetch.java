package com.Hibernate_demo2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Employee_Fetch {
	public static void fetch() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.beginTransaction();
		Employee employee = session.get(Employee.class, 103);
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getAge());
		System.out.println(employee.getSalary());
		tran.commit();
		session.close();
		sf.close();

	}

}
