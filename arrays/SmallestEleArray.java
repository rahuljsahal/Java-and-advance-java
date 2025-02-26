package arrays;

public class SmallestEleArray {
	public static void main(String[] args) {
		int arr[] = ArrayOperation.readArray();
		int small = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (small > arr[i]) {
				small = arr[i];
			}
		}
		System.out.println("Smallest no. is: " + small);

	}
}
