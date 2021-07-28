package sortingAlgorithms;

import java.util.Arrays;

public class QuickSort {

    public static void main(String... args) {

//        int[] arr = {12, 1, 34, 5, 23, 67, 43, 15, 5, 8, 4, 87};
        int[] arr = {20, 35, -15, 7, 55, 1, -22};

        int i = 0, j = 10;

        callQuickSort(arr);

        Arrays.stream(arr).forEach(System.out::println);
    }

    static void callQuickSort(int[] arr) {
        quicksort(arr, 0, arr.length);
    }

    static void quicksort(int[] arr, int start, int end) {
        if(end - start < 2) { // if the arr contains only one element
            return;
        }
        int pivotIndex = getPartition(arr, start, end);
        quicksort(arr, start, pivotIndex);
        quicksort(arr, pivotIndex + 1, end);
    }

    private static int getPartition(int[] arr, int start, int end) {
        int i = start;
        int j = end;
        int pivot = arr[start];

        while (i < j) {

            while (i < j && arr[--j] >= pivot); // from right to left to find a number less than the pivot
            if(i < j) {
                arr[i] = arr[j];
            }
            while (i < j && arr[++i] <= pivot);
            if(i < j) {
                arr[j] = arr[i];
            }
        }
        arr[j] = pivot;
        return j;
    }
}
