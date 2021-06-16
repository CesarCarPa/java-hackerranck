package arrays;

import java.util.List;

public class ArrayManipulationOperations {

    public static void main(String... args){

        List<List<Integer>> queries = List.of(
                List.of(1,2,100),
                List.of(2,5,100),
                List.of(3,4,100)
        );
        arrayManipulation(5, queries);
    }

    static void arrayManipulation(int n, List<List<Integer>> queries){
        long max = 0, sum = 0;
        long[] arr = new long[n + 1];
        for(List<Integer> op: queries){
            arr[op.get(0)-1] += op.get(2);
            arr[op.get(1)] -= op.get(2);
        }
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}
