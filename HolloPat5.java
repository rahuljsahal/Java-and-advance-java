package patterns;

import java.util.Scanner;

public class HolloPat5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		sc.close();
		for (int i = 1; i <= 2 * n - 1; i++) {
			for (int j = 1; j <= 2 * n - 1; j++) {
				if (i == 1 || j == 1 || j == 2 * n - 1 || i == 2 * n - 1 || i == n || j == n) {
					System.out.print("*" + " ");
				} else {
					System.out.print(" " + " ");
				}

			}
			System.out.println();
		}
	}

}
