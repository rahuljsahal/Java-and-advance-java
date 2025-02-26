package arrays;

import java.util.Scanner;

public class ArrayQ2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements of Arrays");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Even numbers in given Array are: ");
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] % 2 == 0)
				System.out.print(arr[i] + " ");

		}
		sc.close();

	}
}
