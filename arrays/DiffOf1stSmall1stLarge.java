package arrays;

public class DiffOf1stSmall1stLarge {
	public static void main(String[] args) {
		int arr[] = ArrayOperation.readArray();
		int small = arr[0], large = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < small) {
				small = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > large) {
				large = arr[i];
			}
		}
		System.out.println(
				"Difference b/w smallest " + small + " and the largest " + large + " of array is " + (large - small));
	}

}
