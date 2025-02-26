package string;

import java.util.Scanner;

public class RemoveSpace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		char[] ch = s.toCharArray();
		String s1 = "";
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ' ') {
				continue;
			} else
				s1 = s1 + ch[i];
		}
		System.out.println(s1);
		sc.close();
	}

}
