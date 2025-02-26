package arrays;

import java.util.Scanner;

public class EnterDigitAtIndex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int brr[] = new int[n + 1];
		System.out.println("Enter Element of Array");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter Index");
		int index = sc.nextInt();
		System.out.println("Enter Element");
		int element = sc.nextInt();
		for (int i = 0; i < brr.length; i++) {
			if (i == index)
				brr[i] = element;
			else if (i < index)
				brr[i] = arr[i];
			else if (i > index)
				brr[i] = arr[i - 1];
		}
		for (int i = 0; i <= brr.length - 1; i++) {
			System.out.print(brr[i] + " ");
		}
		sc.close();
	}

}
