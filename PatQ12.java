package patterns;

import java.util.Scanner;

public class PatQ12 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		for (int i = 1; i <= 2 * n - 1; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 1 || i == 1 || i == n || i < j)
					System.out.print("*" + " ");
				else
					System.out.print(" " + " ");
			}
			System.out.println();
		}
		sc.close();

	}
	// || i < j || (i + j) % 2 == 0 && i != j

}
