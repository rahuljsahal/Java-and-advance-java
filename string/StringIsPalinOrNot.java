package string;

import java.util.Scanner;

public class StringIsPalinOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.next();
		String s2 = "";
		for (int i = 0; i < s.length(); i++) {
			s2 = s.charAt(i) + s2;
		}
		sc.close();
		if (s2.equals(s)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}
}
