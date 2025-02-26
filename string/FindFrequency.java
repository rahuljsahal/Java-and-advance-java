package string;

import java.util.Scanner;

public class FindFrequency {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		int[] count = new int[128];
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'A' && ch <= 'Z')
				count[ch]++;
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0) {
				System.out.println((char) (i) + "---->" + count[i]);
			}
		}
		sc.close();
	}

}
