package arrays;

import java.util.Scanner;

public class ArraySum {
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
		int sum = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum of Array elements: " + sum);

	}
}
