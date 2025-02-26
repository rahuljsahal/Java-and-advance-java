package twoDarray;

import java.util.Scanner;

public class Char2DArray {
	public static char[][] charArray() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Row Size");
		int row = sc.nextInt();
		System.out.println("Enter Column Size");
		int column = sc.nextInt();
		char[][] arr = new char[row][column];
		System.out.println("Enter Elements of Array");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.next().charAt(0);
			}
		}

		return arr;

	}

	public static void displayArray(char[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
				if (j < arr[i].length - 1)
					System.out.print(",");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		char[][] read = charArray();
		displayArray(read);
	}
}
