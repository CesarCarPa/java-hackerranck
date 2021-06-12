import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sorting {

    public static void main(String... args){

        int n = 3;
        List<Integer> arr = List.of(3,2,1);
        int[] a = arr.stream().mapToInt(i -> i).toArray();

        int numberOfSwaps = 0;
        for (int i = 0; i < n; i++) {
            // Track number of elements swapped during a single array traversal

            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    int jValue = a[j];
                    a[j] = a[j+1];
                    a[j+1] = jValue;
                    numberOfSwaps++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }
        Arrays.stream(a).forEach(x -> System.out.println(x));
        System.out.printf("Num of swaps: %d", numberOfSwaps);
    }

}
