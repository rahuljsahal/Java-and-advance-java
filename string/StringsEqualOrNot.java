package string;

import java.util.Scanner;

public class StringsEqualOrNot {
	boolean compareString() {
		Scanner sc = new Scanner(System.in);
		boolean b = false;
		System.out.println("Enter 1st string");
		String s1 = sc.nextLine();
		System.out.println("Enter 2nd string");
		String s2 = sc.nextLine();
		if (s1.equals(s2)) {
			b = true;
		}
		sc.close();
		return b;
	}

	public static void main(String[] args) {

	}

}
