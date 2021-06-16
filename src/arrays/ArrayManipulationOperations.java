package arrays;

import java.util.Scanner;

public class ArrayManipulationOperations {

    public static void main(String... args){

        some();
    }

    static void some(){
        Scanner scan = new Scanner(System.in);
        System.out.println("value of N");
        int N = scan.nextInt();
        System.out.println("value of M");
        int M = scan.nextInt();

        /* Save interval endpoint's "k" values in array */
        long [] array = new long[N + 1];
        while (M-- > 0) {
            System.out.println("value of a");
            int a = scan.nextInt();
            System.out.println("value of b");
            int b = scan.nextInt();
            System.out.println("value of k");
            int k = scan.nextInt();
            array[a-1] += k;
            array[b]   -= k;
        }
        scan.close();

        /* Find max value */
        long sum = 0;
        long max = 0;
        for (int i = 0; i < N; i++) {
            sum += array[i];
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}
