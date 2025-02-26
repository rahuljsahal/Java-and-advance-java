package patterns;

import java.util.Scanner;

public class Pat16 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		sc.close();
		for (int i = 1; i <= 2 * n - 1; i++) {
			int a = 2 * n - 1;

			for (int j = 1; j <= 2 * n - 1; j++) {
				if (i + j >= 2 * n) {
					System.out.print(a-- + " ");
				} else {
					System.out.print(" " + " ");
				}

			}
			System.out.println();
		}
	}

}
