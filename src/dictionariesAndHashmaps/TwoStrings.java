package dictionariesAndHashmaps;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TwoStrings {

    public static void main(String... args){

        String s1 = "and", s2 = "art";

        System.out.println(twoStrings(s1, s2));
    }

    static String twoStrings(String s1, String s2){
        Set<String> setS1 = new HashSet();
        Set<String> setS2 = new HashSet();
        Collections.addAll(setS1, s1.split(""));
        Collections.addAll(setS2, s2.split(""));
        return Collections.disjoint(setS1, setS2) ? "NO" : "YES";
    }

    static String twoStringsLimitExceed(String s1, String s2){
        for (int i = 0; i < s1.length(); i++) {
            for (int j = i+1; j+i <= s1.length(); j++) {
                String subS = s1.substring(i, j);
                if(s2.contains(subS)){
                    return "YES";
                }
            }
        }
        return "NO";
    }
}
