package characterPattern;

import java.util.Scanner;

public class PatQ1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter odd name");
		String a = sc.next();
		int len = a.length();
		for (int i = 0; i <= len - 1; i++) {
			for (int j = 0; j <= len - 1; j++) {
				if (i == j || i + j == len - 1) {
					System.out.print(a.charAt(i) + " ");
				} else {
					System.out.print(" " + " ");
				}
			}
			System.out.println();
		}

	}

}
