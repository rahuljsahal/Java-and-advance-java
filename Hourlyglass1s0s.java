/*
 1 0 1 0 1 0 1 0 1
   1 0 1 0 1 0 1
     1 0 1 0 1
       1 0 1 
         1
       1 0 1
     1 0 1 0 1
   1 0 1 0 1 0 1
 1 0 1 0 1 0 1 0 1        
 */
package patterns;

import java.util.Scanner;

public class Hourlyglass1s0s {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		sc.close();
		for (int i = 1; i <= n; i++) {
			int a = 1;
			for (int j = 1; j <= n; j++) {
				if (i <= j && i + j <= n + 1 || i + j >= n + 1 && i >= j) {
					System.out.print(a++ % 2 + " ");
				} else {
					System.out.print(" " + " ");
				}

			}
			System.out.println();
		}

	}

}
