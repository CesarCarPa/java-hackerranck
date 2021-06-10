package warmup;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RepeatedString {

    public static void main(String... args){

        System.out.println(repeatedString("aba", 1000000000000l));
    }

    /**
     * This one just works for INT values
     * @param s
     * @param n
     * @return
     */
    public static long repeatedStringInt(String s, long n){
        String newS = Stream.generate(() -> s).limit(n/s.length()+1).collect(Collectors.joining());
        return newS.substring(0,(int)n).chars().filter(ch -> ch=='a').count();
    }

    public static long repeatedStringLong(String s, long n){
        long aCount = 0;
        int index = 0;
        for (long stringIndex = 0; stringIndex < n; stringIndex++) {
            if(s.charAt(index) == 'a'){
                aCount ++;
            }
            index ++;
            if(index == s.length()){
                index = 0;
            }
        }
        return aCount;
    }

    /**
     * s = aba   n = 10
     * @param s
     * @param n
     * @return
     */
    public static long repeatedString(String s, long n){
        long size = s.length(), repeated = n/size;
        // size=3 repeated=3
        long left = n - (size * repeated);
        // left=10-(9)=1
        int extra = 0;

        int count = 0;
        for(int i = 0; i < size; i++){
            if(s.charAt(i) == 'a'){
                ++count;
            }
        }

        for(int i = 0; i < left; i++){
            if(s.charAt(i) == 'a'){
                ++extra;
            }
        }
        return (repeated * count) + extra;
    }
}
