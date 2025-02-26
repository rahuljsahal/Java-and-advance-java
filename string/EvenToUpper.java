package string;

import java.util.Scanner;

public class EvenToUpper {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		s = s.toLowerCase();
		String s1 = "";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (i % 2 == 0) {
				ch[i] = (char) (ch[i] - 32);
			}
			s1 = s1 + ch[i];
		}
		System.out.println(s1);

		sc.close();
	}

}
