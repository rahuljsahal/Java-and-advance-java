package com.Hibernate_Demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Student student = new Student();
		student.setStudentID(102);
		student.setStudentName("Rahul");
		student.setStudentAge(23);
		student.setStudentMarks(80);

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(student);
		transaction.commit();
		session.close();
		sf.close();

	}
}
