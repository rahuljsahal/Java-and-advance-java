package string;

import java.util.Scanner;

public class FirstCharToUpper {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		s = s.toLowerCase();
		String s1 = "";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (i == 0 || s.charAt(i) != ' ' && s.charAt(i - 1) == ' ') {
				s1 = s1 + (char) (s.charAt(i) - 32);
			} else
				s1 = s1 + s.charAt(i);
		}
		System.out.println(s1);

		sc.close();
	}

}
