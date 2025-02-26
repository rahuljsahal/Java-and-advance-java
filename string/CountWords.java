package string;

import java.util.Scanner;

public class CountWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		int count = 0;
		s = s.toLowerCase();
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (i == 0 || s.charAt(i) != ' ' && s.charAt(i - 1) == ' ') {
				count++;
			}
		}
		System.out.println(count);
		sc.close();

	}
}
