package com.jsp.jdbc.productdb;

import java.util.Scanner;

import com.jsp.jdbc.productdb.dao.ProductDao;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ProductDao p = new ProductDao();
		System.out.println("Enter choice");
		System.out.println("1: Add Product");
		System.out.println("2: Find Product by ID");
		System.out.println("3: Find Product by Name");
		System.out.println("4: Find All Products Between Price");
		System.out.println("5: Update All Product Price By Brand");
		System.out.println("6: Update All Product Price Between ID");
		System.out.println("7: Delete All Product By Brand");
		System.out.println("8: Delete All Product With Price Greater Than");
		System.out.println("9: Exit");

		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			p.addProduct();
			break;
		case 2:
			p.findProductById();
			break;
		case 3:
			p.findProductByName();
			break;
		case 4:
			p.findAllProductsBetweenPrice();
			break;
		case 5:
			p.updateAllProductPriceByBrand();
			break;
		case 6:
			p.updateAllProductPriceBetweenId();
			break;
		case 7:
			p.deleteAllProductByBrand();
			break;
		case 8:
			p.deleteAllProductWithPriceGreaterThan();
			break;
		case 9:
			System.out.println("Exited");
			System.exit(0);

		default:
			System.out.println("Invalid Input");
		}
		sc.close();
	}

}
