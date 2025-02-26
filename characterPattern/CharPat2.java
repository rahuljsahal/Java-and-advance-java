/*
Enter n
5
        A         
      A B A       
    A B C B A     
  A B C D C B A   
A B C D E D C B A 
  A B C D C B A   
    A B C B A     
      A B A       
        A    
*/
package characterPattern;

import java.util.Scanner;

public class CharPat2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		sc.close();
		for (int i = 1; i <= 2 * n - 1; i++) {
			char a = 'A';
			for (int j = 1; j <= 2 * n - 1; j++) {
				if (i + j >= n + 1 && j - i <= n - 1 && i + j <= 3 * n - 1 && i - j <= n - 1) {
					if (j >= n) {
						System.out.print(a-- + " ");
					} else {
						System.out.print(a++ + " ");
					}
				} else {
					System.out.print(" " + " ");
				}

			}
			System.out.println();
		}

	}
}
