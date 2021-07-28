package sortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String... args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        selectionSort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static void swap(int[] arr, int i, int j) {
        if(i == j) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * Big O = n²
     * Unstable - doesn't keep the repeated values in its order
     * Look for the greatest element in the array and move it to the lastUnsortedIndex
     * position each iteration
     * Doesn't require as much swaps as bubble sort
     */
    static void selectionSort(int[] arr) {
        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex --) {
            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if(arr[i] > arr[largest]) {
                    largest = i;
                }
            }
            swap(arr, lastUnsortedIndex, largest);
        }
    }
}
