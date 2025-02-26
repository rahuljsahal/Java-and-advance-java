package arrays;

import java.util.Scanner;

public class ArrayEachElementFactorial {
	public static int fact(int n) {
		int fact = 1;
		for (int i = 0; i <= n; i++) {
			fact = fact * i;
		}
		return fact;

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
			int result = fact(arr[i]);
			System.out.println(result);
		}

	}

}
