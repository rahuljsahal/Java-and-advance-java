package com.jsp.jdbc.productdb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ProductDao {
	Scanner sc = new Scanner(System.in);
	Connection conn = null;
	int rowInserted = 0;

	public void addProduct() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_productdb?user=root&password=root");
			PreparedStatement pst = conn.prepareStatement("INSERT INTO product VALUES(?,?,?,?)");
			System.out.println("Enter Product ID: ");
			pst.setInt(1, sc.nextInt());
			System.out.println("Enter Product Name: ");
			pst.setString(2, sc.next());
			System.out.println("Enter Product Brand: ");
			pst.setString(3, sc.next());
			System.out.println("Enter Product Price: ");
			pst.setInt(4, sc.nextInt());
			rowInserted = pst.executeUpdate();
			if (rowInserted > 0) {
				System.out.println(rowInserted + " Product Added");
			} else {
				System.out.println("Product Not Added");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void findProductById() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_productdb?user=root&password=root");
			PreparedStatement pst = conn.prepareStatement("select * from product where productId= ?");
			System.out.println("Enter Product Id: ");
			pst.setInt(1, sc.nextInt());
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				System.out.println("Product ID: " + rs.getInt(1));
				System.out.println("Product Name: " + rs.getString(2));
				System.out.println("Product Brand: " + rs.getString(3));
				System.out.println("Product Price: " + rs.getInt(4));
				System.out.println("---------------------------------------------");
			} else {
				System.out.println("Product Not Found!! Invalid Input");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}

	}

	public void findProductByName() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_productdb?user=root&password=root");
			PreparedStatement pst = conn.prepareStatement("select * from product where productName= ?");
			System.out.println("Enter Product Name");
			pst.setString(1, sc.next());
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				System.out.println("Product ID: " + rs.getInt(1));
				System.out.println("Product Name: " + rs.getString(2));
				System.out.println("Product Brand: " + rs.getString(3));
				System.out.println("Product Price: " + rs.getInt(4));
				System.out.println("---------------------------------------------");
			} else
				System.out.println("Product Not Found!! Invalid Input");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}

	public void findAllProductsBetweenPrice() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_productdb?user=root&password=root");
			PreparedStatement pst = conn.prepareStatement("select * from product where productPrice BETWEEN ? AND ?");
			System.out.println("Enter Lower Limit");
			pst.setInt(1, sc.nextInt());
			System.out.println("Enter Upper Limit");
			pst.setInt(2, sc.nextInt());
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				System.out.println("Product ID: " + rs.getInt(1));
				System.out.println("Product Name: " + rs.getString(2));
				System.out.println("Product Brand: " + rs.getString(3));
				System.out.println("Product Price: " + rs.getInt(4));
				System.out.println("---------------------------------------------");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}

	public void updateAllProductPriceByBrand() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_productdb?user=root&password=root");
			PreparedStatement pst = conn.prepareStatement("SELECT * FROM product WHERE productBrand = ?");
			System.out.println("Enter Product Brand");
			pst.setString(1, sc.next());
			ResultSet rs = pst.executeQuery();
			int increasdPrice = 100;
			int currentPrice = rs.getInt(4);
			int count = 0;
			while (rs.next()) {
				int productBrand = rs.getInt(3);
				pst = conn.prepareStatement("UPDATE product SET productPrice = ? WHERE productBrand = ?");
				pst.setInt(1, currentPrice + increasdPrice);
				pst.setString(2, productBrand);
				pst.executeUpdate();
				count++;
			}
			if (count > 0) {
				System.out.println("Updated!!");
			} else {
				System.out.println("Not Updated");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void updateAllProductPriceBetweenId() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_productdb?user=root&password=root");
			PreparedStatement pst = conn.prepareStatement("SELECT * FROM product WHERE productId BETWEEN ? AND ?");
			System.out.println("Enter Initial ID you want to update price from: ");
			pst.setInt(1, sc.nextInt());
			System.out.println("Enter Final ID you want to update price upto: ");
			pst.setInt(2, sc.nextInt());
			ResultSet rs = pst.executeQuery();
			System.out.println("Enter Amount to be Added");
			int increasdPrice = sc.nextInt();
			int count = 0;
			while (rs.next()) {
				int productId = rs.getInt(1);
				int currentPrice = rs.getInt(4);
				pst = conn.prepareStatement("UPDATE product SET productPrice = ? WHERE productId = ?");
				pst.setInt(1, currentPrice + increasdPrice);
				pst.setInt(2, productId);
				pst.executeUpdate();
				count++;
			}
			if (count > 0) {
				System.out.println("Updated!!");
			} else {
				System.out.println("Not Updated");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void deleteAllProductByBrand() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_productdb?user=root&password=root");
			PreparedStatement pst = conn.prepareStatement("DELETE from product where productBrand= ?");
			System.out.println("Enter Product Brand");
			pst.setString(1, sc.next());
			rowInserted = pst.executeUpdate();
			if (rowInserted > 0)
				System.out.println(rowInserted + " Product Deleted");
			else
				System.out.println("Product Not Deleted!! Invalid Input");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}

	public void deleteAllProductWithPriceGreaterThan() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_productdb?user=root&password=root");
			PreparedStatement pst = conn.prepareStatement("DELETE from product where productPrice > ?");
			System.out.println("Enter Amount");
			pst.setInt(1, sc.nextInt());
			rowInserted = pst.executeUpdate();
			if (rowInserted > 0)
				System.out.println(rowInserted + " Product Deleted");
			else
				System.out.println("Product Not Deleted!! Invalid Input");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}
}
