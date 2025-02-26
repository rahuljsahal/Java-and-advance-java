package string;

import java.util.Scanner;

public class ReplaceCharAtIndex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		System.out.println("Enter Index to replace");
		int index = sc.nextInt();
		System.out.println("Enter character to insert");
		char c = sc.next().charAt(0);
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (i == index) {
				ch[i] = c;
			}

		}
		String s1 = new String(ch);
		System.out.println(ch);
	}
}
