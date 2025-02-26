package twoDarray;

public class LargestEleRowWise {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2 }, { 3, 4 } };
		for (int i = 0; i < arr.length; i++) {
			int largest = 0;
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > largest)
					largest = arr[i][j];
			}
			System.out.println("Largest " + largest);
		}

	}

}
