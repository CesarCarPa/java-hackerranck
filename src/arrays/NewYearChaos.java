package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NewYearChaos {

    public static void main(String... args){
//        List<Integer> q = List.of(2,1,5,3,4);
        List<Integer> q = List.of(1,2,5,3,7,8,6,4);
//        minimumBribes(q);
//        min(q);
        minArr(q.stream().toArray(Integer[]::new));
    }

    static void minimumBribes(List<Integer> q){
        int minBribes = 0;
        for(int i=q.size()-1; i>=0; i--){
            int p = i+1, inPositioin = q.get(i);
            if(inPositioin > p){
                int bribes = inPositioin - p;
                if(bribes > 2){
                    System.out.println("Too chaotic");
                    break;
                }
                minBribes += bribes;
            }
        }
        if(minBribes > 0)
            System.out.println(minBribes);
    }

    //1,2,5,3,7,8,6,4
    static void min(List<Integer> q){
        int mimBribes = 0;
        for (int i = 0; i < q.size()-1; i++) {
            int p = q.get(i);
            int count = (int) q.subList(i+1, q.size()).stream().filter(n -> p>n).count();
            if(count > 2){
                System.out.println("Too chaotic");
                return;
            }
            mimBribes += count;
        }
        if(mimBribes > 0)
            System.out.println(mimBribes);
    }

    static void minArr(Integer[] q){
        int temp, count = 0, check =0;
        int[] bribe = new int[1000000];
        boolean isSorted = false;
        while(isSorted != true){
            isSorted = true;
            for(int i=q.length-1; i>0 ; --i){
                if(q[i] < q[i-1]){
                    temp = q[i-1];
                    q[i-1] = q[i];
                    q[i] = temp;
                    bribe[q[i]]++;
                    count++;
                    if(bribe[q[i]] > 2) {
                        System.out.println("Too chaotic");
                        check++;
                        break;
                    }
                    isSorted = false;
                }
            }
        }
        if(check == 0)
            System.out.println(count);
    }
}
