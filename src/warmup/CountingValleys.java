package warmup;

public class CountingValleys {

    public static void main(String... args){

        String path = "DDUUUUDD";
//        String path = "UDDDUDUU";

        System.out.printf("Num of vallyes is %d", countingValleys(8, path));
        Math.pow(1,2);
    }

    static int power(int n, int p)throws Exception{
        if(n<0 || p<0){
            throw new Exception("message");
        }
        return (int) Math.pow(n, p);
    }

    public static int countingValleys(int steps, String path){
        int pathSum = 0, valleysCount = 0;
        boolean isInValley = false;
        for(int i=0; i<steps; i++){
            pathSum = path.charAt(i) == 'U' ? pathSum+1 : pathSum-1;
            if(pathSum == 0 && isInValley){
                valleysCount ++;
                isInValley = false;
            }
            if(pathSum < 0){
                isInValley = true;
            }
        }
        return valleysCount;
    }
}
