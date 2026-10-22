public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = {64, 25, 12, 22, 11};

		System.out.print("Starting array: ");
		printArray(arr);

		for (int i = 1; i < arr.length; i++) {
			int k = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > k) {
				arr[j + 1] = arr[j];
				j--;
			}

			arr[j + 1] = k;

			System.out.print("After pass " + i + ": ");
			printArray(arr);
		}
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
