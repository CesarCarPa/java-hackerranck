package sortingAlgorithms;

import java.util.Arrays;

public class MergeSort {

    public static void main(String... args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        mergeSort(arr, 0, arr.length);
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
     * Big O = n log n (divides constantly)
     * Stable - keeps the repeated values in its order
     * Two phases; splitting and merging.
     * Not In-place, uses temporary arrays.
     */
    static void mergeSort(int[] arr, int start, int end) {
        if(end - start < 2) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);
        merge(arr, start, end, mid);
    }

    private static void merge(int[] arr, int start, int end, int mid) {
        if(arr[mid - 1] <= arr[mid]) {
            return;
        }
        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];

        while(i < mid && j < end) {
            temp[tempIndex++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }
        System.arraycopy(arr, i, arr, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, arr, start, tempIndex);
    }

}
