package sortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String... args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        bubbleSort(arr);
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
     * Compares the first element with the second one and move to greater to the right
     * position each iteration
     */
    static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(arr[j] > arr[j + 1]) {
                    swap(arr, j, j+1);
                }
            }
        }
    }
}
