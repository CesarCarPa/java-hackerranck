package arrays;

public class MinumSwaps2 {
    public static void main(String... args){

//        int[] arr = {7,1,3,2,4,5,6};
        int[] arr = {4,3,1,2};
        System.out.println(minimumSwaps(arr));
    }

    static int minimumSwaps(int[] arr){
        int count = 0, i = 0;
        while(i < arr.length){
            // if element is not in the right position
            while(arr[i] != i+1){
                int temp = 0;
                //swap element with correct position
                temp = arr[arr[i]-1];
                arr[arr[i]-1] = arr[i];
                arr[i] = temp;
                count ++;
            }
            i ++;
        }
        return count;
    }
}
