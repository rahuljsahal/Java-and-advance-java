package arrays;

import java.util.Scanner;

public class ArrayProd {
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
		int prod = 1;
		for (int i = 0; i <= arr.length - 1; i++) {
			prod = prod * arr[i];
		}
		System.out.println("Product of Array elements: " + prod);

	}

}
