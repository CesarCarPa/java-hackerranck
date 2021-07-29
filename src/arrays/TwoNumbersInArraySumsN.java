package arrays;

import java.util.Arrays;

public class TwoNumbersInArraySumsN {

    public static void main(String[] args) {

        int[] arr = {1, 4, 45, 6, 10, -8};

        sortArray(arr, 0, arr.length);
        Arrays.stream(arr).forEach(System.out::println);

        System.out.println(
            foundCouple(arr, -7)
        );
    }

    static String foundCouple(int[] arr, int target) {
        int i = 0, j = arr.length-1;
        while(i < j) {
            int sum = arr[i] + arr[j];
            if(sum == target){
                return String.format("%d plus %d sum %d", arr[i], arr[j], target);
            }
            if(sum < target) {
                i++;
            }else{
                j--;
            }
        }
        return String.format("No couple that sums %d", target);
    }

    private static void sortArray(int[] arr, int start, int end) {
        if(end - start < 2) {
            return;
        }
        int pivotIndex = partition(arr, start, end);
        sortArray(arr, start, pivotIndex);
        sortArray(arr, pivotIndex + 1, end);
    }

    private static int partition(int[] arr, int start, int end) {
        int i = start, j = end, pivot = arr[start];
        while(i < j) {
            while(i < j && arr[--j] >= pivot);
            if(i < j)
                arr[i] = arr[j];

            while(i < j && arr[++i] <= pivot);
            if(i < j)
                arr[j] = arr[i];
        }
        arr[j] = pivot;
        return j;
    }
}
