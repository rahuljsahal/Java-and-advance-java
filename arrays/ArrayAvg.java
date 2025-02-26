package arrays;

import java.util.Scanner;

public class ArrayAvg {
	public static int isFact(int e) {
		int fact = 1;
		for (int j = 1; j <= e; j++) {
			fact = fact * j;
		}
		return e;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements of Arrays");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		for (int i = 0; i <= arr.length - 1; i++) {
			int factorial = isFact(arr[i]);
			System.out.println("Factorial of each Elements in give array: " + factorial);

		}

	}

}
