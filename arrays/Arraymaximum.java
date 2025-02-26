package arrays;

import java.util.Scanner;

public class Arraymaximum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter Element of Array");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		int largest = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] > largest)
				largest = arr[i];
		}
		System.out.println("Largest no. in given array: " + largest);
	}

}
