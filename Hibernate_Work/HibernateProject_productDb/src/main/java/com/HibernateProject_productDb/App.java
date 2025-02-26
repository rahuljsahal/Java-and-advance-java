package com.HibernateProject_productDb;

import java.util.Scanner;

import com.HibernateProject_productDao.ProductDao;

public class App {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ProductDao p = new ProductDao();
		System.out.println("Enter a no. between 1 to 4");
		System.out.println("To Add Product enter 1");
		System.out.println("To Fetch Product by ID enter 2");
		System.out.println("To Update Product Title by ID enter 3");
		System.out.println("To Delete Product Price by Id enter 4");
		int a = sc.nextInt();

		switch (a) {
		case 1:
			p.addProduct();
			break;
		case 2:
			p.deleteProductById();
		case 3:
			p.updatePriceById();
			break;
		case 4:
			p.findProductById();
			break;
		case 5:
			p.updateProductTitleById();
			break;

		default:
			System.out.println("Invalid Input");
			break;
		}
	}
}
