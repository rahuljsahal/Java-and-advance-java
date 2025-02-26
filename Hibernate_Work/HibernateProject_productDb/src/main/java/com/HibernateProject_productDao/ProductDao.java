package com.HibernateProject_productDao;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.HibernateProject_productDb.entity.Product;

public class ProductDao {
	Configuration cfg = new Configuration().configure().addAnnotatedClass(Product.class);
	SessionFactory sf = cfg.buildSessionFactory();
	Scanner sc = new Scanner(System.in);

	public void addProduct() {
		Product product = new Product();
		System.out.println("Enter Product ID: ");
		product.setProductId(sc.nextInt());
		System.out.println("Enter Product Tilte: ");
		product.setTitle(sc.next());
		System.out.println("Enter Product Brand: ");
		product.setBrand(sc.next());
		System.out.println("Enter Product Price: ");
		product.setPrice(sc.nextInt());

		Configuration cfg = new Configuration().configure().addAnnotatedClass(Product.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.beginTransaction();
		//
		session.save(product);
		tran.commit();
		session.close();
		sf.close();
	}

	public void findProductById() {
	}

	public void updateProductTitleById() {
	}

	public void updatePriceById() {
	}

	public void deleteProductById() {
	}

}
