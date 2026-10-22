public class SortAndBinarySearch {
	public static void main(String[] args) {
		int[] arr = {64, 25, 12, 22, 11, 24};
		int find = 24;

		System.out.print("Before sorting: ");
		printArray(arr);

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int k = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = k;
				}
			}
		}

		System.out.print("After sorting: ");
		printArray(arr);

		int i = 0;
		int j = arr.length - 1;
		int k = -1;

		while (i <= j) {
			int middle = (i + j) / 2;

			if (arr[middle] == find) {
				k = middle;
				break;
			} else if (arr[middle] < find) {
				i = middle + 1;
			} else {
				j = middle - 1;
			}
		}

		if (k != -1) {
			System.out.println(find + " found at index " + k);
		} else {
			System.out.println(find + " was not found");
		}
	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
