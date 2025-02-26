package arrays;

import java.util.Scanner;

public class ArrayOperation {
	public static int[] readArray() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter Elements");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;

	}

	public static void displayArray(int arr[]) {
		System.out.print("[");
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i]);
			if (i < arr.length - 1)
				System.out.print(",");
		}
		System.out.print("]");

	}

}
