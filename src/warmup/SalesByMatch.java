package warmup;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SalesByMatch {

    public static void main(String... args){
        List<Integer> ar = List.of(1,2,3,4,2,3,2);
        System.out.println(ar);
        System.out.println(sockMerchant(0, ar));;
    }

    public static int sockMerchant(int n, List<Integer> ar){
        List<Integer> sortedAr = ar.stream().sorted().collect(Collectors.toList());
        Map<Object, Long> mapCount = ar.stream()
                .collect(Collectors.groupingBy(num -> num, Collectors.counting()));
        Long count = mapCount.values().stream().map(num -> num/2).reduce(Long::sum).orElse(0l);
        return count.intValue();
    }
}
