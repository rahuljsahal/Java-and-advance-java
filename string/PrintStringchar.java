package string;

import java.util.Scanner;

public class PrintStringchar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		sc.close();
		String s = sc.nextLine();
		for (char ch : s.toCharArray()) {
			System.out.println(ch);
		}
	}

}
