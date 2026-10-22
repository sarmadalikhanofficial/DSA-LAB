public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {64, 25, 24, 11, 22};

        // Selection Sort Algorithm
        for (int i = 0; i < arr.length - 1; i++) {

            int min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        // Output the sorted array
        System.out.println("Sorted Array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}