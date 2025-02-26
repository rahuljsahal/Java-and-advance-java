package arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int[] ar = ArrayOperation.readArray();
		int[] br = RevArr(ar);
		ArrayOperation.displayArray(br);
	}

	public static int[] RevArr(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			int rev = 0;
			while (ar[i] != 0) {
				int digit = ar[i] % 10;
				System.out.println("F" + digit);
				rev = rev * 10 + digit;
				ar[i] = ar[i] / 10;
			}
			System.out.println("R" + rev);
			ar[i] = rev;
		}
		return ar;

	}
}
