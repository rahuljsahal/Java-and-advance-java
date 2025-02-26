package string;

import java.util.Scanner;

public class SwapChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		int f = 0;
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (i == 0 || (ch[i] != ' ' && ch[i - 1] == ' ')) {
				f = i;
			}
			if (i == ch.length - 1 || ch[i] != ' ' && ch[i + 1] == ' ') {
				char temp = ch[i];
				ch[i] = ch[f];
				ch[f] = temp;
			}

		}
		String s1 = new String(ch);
		System.out.println(s1);
		sc.close();
	}
}
