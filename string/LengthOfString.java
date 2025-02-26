package string;

import java.util.Scanner;

public class LengthOfString {
	public static void main(String[] args) {
		int length = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		sc.close();
		System.out.println(s.length());
		// without using length()
		for (@SuppressWarnings("unused")
		char ch : s.toCharArray()) {
			length++;
		}
		System.out.println("Lenth of given string is " + length);
	}

}
