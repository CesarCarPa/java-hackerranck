package warmup;

import java.util.List;

public class JumpingInClouds {

    public static void main(String... args){
        List<Integer> c = List.of(0,0,1,0,0,1,0);
        // 0 1 0 1 0 1 0 0 0 -> 9
        System.out.println(junpingOnClouds(c));
    }

    private static int junpingOnClouds(List<Integer> c){
        int stepsCount = 0, start = 0;
        while(start < c.size()){
            if(start+2 < c.size() && c.get(start+2) == 0){
                start += 2;
                stepsCount ++;
                continue;
            }
            if(start+1 < c.size() && c.get(start+1) == 0){
                start += 1;
                stepsCount ++;
                continue;
            }
            if(start == c.size() - 1){
                break;
            }
        }
        return stepsCount;
    }
}
