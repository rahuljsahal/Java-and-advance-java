package com.Hibernate_demo2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Employee_Delete {
	public static void delete() {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.beginTransaction();
		Employee employee = session.get(Employee.class, 106);
		session.delete(employee);
		tran.commit();
		session.close();
		sf.close();
	}

}
