package sortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String... args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        insertionSort(arr);
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
     * Stable - keeps the repeated values in its order
     */
    static void insertionSort(int[] arr) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex ++ ) {
            int newElement = arr[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && arr[i - 1] > newElement; i--) {
                swap(arr, i, i - 1);
            }
            arr[i] = newElement;
        }
    }
}
