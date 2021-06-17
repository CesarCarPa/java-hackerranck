import java.util.Scanner;

public class NestedLogic {

    public static void main(String... args){
        Scanner scan = new Scanner(System.in);
        int rDay = scan.nextInt();
        int rMonth = scan.nextInt();
        int rYear = scan.nextInt();
        int dDay = scan.nextInt();
        int dMonth = scan.nextInt();
        int dYear = scan.nextInt();

        int fine=0;

        if(rYear < dYear){
            System.out.println(fine);
            return;
        }else{
            if(rYear > dYear){
                fine=10000;
            }else if(rMonth > dMonth){
                fine=500 * (rMonth - dMonth);
            }else if(rDay > dDay){
                fine=15 * (rDay - dDay);
            }
        }
        System.out.println(fine);
    }
}
