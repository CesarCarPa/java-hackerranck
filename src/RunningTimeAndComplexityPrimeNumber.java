import java.util.Scanner;

public class RunningTimeAndComplexityPrimeNumber {

    static int i = 2;

    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            System.out.println(isPrime(n) ? "Prime" : "Not prime");
        }
    }

    static boolean isPrime(int n){
        if(n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n) ; i++) {
//            for (int i = 2; i <= n/i ; i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }

    static boolean isPrimeLoop(int n){
        if(n <= 1)
            return false;
        if(n == 2)
            return true;
        if(n % 2 == 0)
            return false;
        for (int i = 3; i < n; i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }

    static boolean isPrimeRecursive(int n){
        if(n < 2){
            return false;
        }
        if(n == i){
            return true;
        }
        if(n % i == 0){
            return false;
        }
        i++;
        return isPrimeRecursive(n);
    }
}
