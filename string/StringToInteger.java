package string;

import java.util.Scanner;

public class StringToInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.next();
		int rev = 0;
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			rev = rev * 10 + (ch[i] - '0');
		}
		System.out.println(rev);
		sc.close();
	}

}
