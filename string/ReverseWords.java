package string;

import java.util.Scanner;

public class ReverseWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.nextLine();
		isReverse(s);
		sc.close();
	}

	public static void isReverse(String s) {
		char[] ch = s.toCharArray();
		String s1 = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			int l = i;
			while (i >= 0 && ch[i] != ' ') {
				i--;
			}
			int f = i + 1;
			while (f <= l) {
				s1 = s1 + ch[f];
				f++;
			}
			if (i != 0)
				s1 = s1 + ' ';
		}
		System.out.println(s1);
	}

}
