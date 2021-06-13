package arrays;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class LeftRotationArrays {

    public static void main(String... args){

        List<Integer> a = List.of(1,2,3,4,5);

        System.out.println(rotLeft(a, 4));
    }

    static List<Integer> rotLeft(List<Integer> a, int d){
        Queue<Integer> q = new LinkedList<>();
        q.addAll(a);
        while(d > 0){
            int head = q.remove();
            q.add(head);
            d --;
        }
        return q.stream().map(i->(int)i).collect(Collectors.toList());
    }
}
