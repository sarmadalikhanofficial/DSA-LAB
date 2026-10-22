public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {64, 25, 24, 22, 11};

		System.out.print("Starting array: ");
		printArray(arr);

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

			System.out.print("Pass " + (i + 1) + ": ");
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
