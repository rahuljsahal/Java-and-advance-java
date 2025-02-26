package com.Hibernate_Demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App_Delete {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tran = s.beginTransaction();
		Student student = s.get(Student.class, 102);
		// for delete
		s.delete(student);
		tran.commit();
		s.close();
		sf.close();
	}

}
