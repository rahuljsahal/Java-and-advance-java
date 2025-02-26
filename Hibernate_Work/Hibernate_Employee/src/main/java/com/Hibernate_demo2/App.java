package com.Hibernate_demo2;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no. between 1 to 4");
		System.out.println("To Add employee enter 1");
		System.out.println("To Fetch employee enter 2");
		System.out.println("To Update employee enter 3");
		System.out.println("To Delete employee enter 4");
		int a = sc.nextInt();

		switch (a) {
		case 1:
			Employee_Add.add();
			break;
		case 2:
			Employee_Fetch.fetch();
			break;
		case 3:
			Employee_Update.update();
			break;
		case 4:
			Employee_Delete.delete();
			break;

		default:
			System.out.println("Invalid Input");
			break;
		}
	}

}
