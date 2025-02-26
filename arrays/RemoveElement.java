package arrays;

import java.util.Scanner;

public class RemoveElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = ArrayOperation.readArray();
		System.out.println("Enter index to remove value");
		int index = sc.nextInt();

		int[] brr = new int[arr.length - 1];
		for (int i = 0; i <= brr.length - 1; i++) {
			if (i < index)
				brr[i] = arr[i];
			else if (i >= index)
				brr[i] = arr[i + 1];
		}
		ArrayOperation.displayArray(brr);
		sc.close();
	}

}
