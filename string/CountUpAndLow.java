package string;

import java.util.Scanner;

public class CountUpAndLow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.next();
		int ucc = 0;
		int lcc = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z')
				ucc++;
			else if (ch >= 'a' && ch <= 'z')
				lcc++;
		}
		System.out.println(ucc);
		System.out.println(lcc);
		sc.close();

	}

}
