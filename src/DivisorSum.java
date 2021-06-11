public class DivisorSum {

    public static void main(String... args){
        System.out.println(divisorSum(6));
    }

    static int divisorSum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                sum += i;
            }
        }
        return sum;
    }
}
