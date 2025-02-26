/*
 1 
 1 2
 1 2 3
 1 2 3 4
 1 2 3 4 5
 */
package patterns;

import java.util.Scanner;

public class PatQ13 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		for (int i = 1; i <= 2 * n - 1; i++) {
			for (int j = 1; j <= 2 * n - 1; j++) {
				if (i >= j)
					System.out.print(j + " ");
				else
					System.out.print(" " + " ");
			}
			System.out.println();

			sc.close();
		}

	}
}
