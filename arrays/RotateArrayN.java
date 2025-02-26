package arrays;

import java.util.Scanner;

public class RotateArrayN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = ArrayOperation.readArray();
		System.out.println("Enter No. of rotations");
		int n = sc.nextInt();
		sc.close();
		while (n % ar.length != 0) {
			int temp = ar[ar.length - 1];
			for (int i = ar.length - 1; i > 0; i--) {
				ar[i] = ar[i - 1];
			}
			ar[0] = temp;
			n--;
		}
		ArrayOperation.displayArray(ar);
	}

}
