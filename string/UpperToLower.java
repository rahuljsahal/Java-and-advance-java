package string;

import java.util.Scanner;

public class UpperToLower {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			ch[i] = (char) (ch[i] + 32);// Narrowing
		}
		String s1 = new String(ch);
		System.out.println(s1);
		sc.close();
	}

}
