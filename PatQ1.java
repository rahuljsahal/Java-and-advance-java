/* 
 print * * *
       * * *
       * * *
 */
package patterns;

import java.util.Scanner;

public class PatQ1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows");
		int row = sc.nextInt();
		System.out.println("Enter no. column");
		int column = sc.nextInt();
		for (int i = 1; i <= column; i++) {
			for (int j = 1; j <= row; j++) {
				System.out.print(" " + "*");
			}
			System.out.println(" ");
		}
		sc.close();

	}
}
