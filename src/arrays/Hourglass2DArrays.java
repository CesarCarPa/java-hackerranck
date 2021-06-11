package arrays;

import java.util.List;

public class Hourglass2DArrays {

    public static void main(String... args){


    }

    public static int hourglassSum(List<List<Integer>> arr) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size() - 2; i++) {
            for (int j = 0; j < arr.get(0).size() - 2; j++) {
                int sum = sumHourglass(arr, i, j);
                if(sum > maxSum){
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    private static int sumHourglass(List<List<Integer>> arr, int i, int j){
        int result = arr.get(i+1).get(j+1); //add the center of the hourglass
        for (int k = i; k < i+3; k++) {
            for (int l = j; l < j+3; l++) {
                if(k != i+1){
                    result += arr.get(k).get(l);
                }
            }
        }
        return result;
    }
}
