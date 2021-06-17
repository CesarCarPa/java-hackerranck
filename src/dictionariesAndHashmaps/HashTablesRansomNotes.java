package dictionariesAndHashmaps;

import java.util.ArrayList;
import java.util.List;

public class HashTablesRansomNotes {

    public static void main(String... args){
        List<String> magazine = List.of("give", "me", "one", "grand", "today", "night");
        List<String> note = List.of("give", "one", "grand", "today", "one");

        checkMagazine(magazine, note);
    }

    public static void checkMagazine(List<String> magazine, List<String> note){
        List<String> noteMut = new ArrayList(magazine);
        for(String noteWord: note){
            int i = noteMut.indexOf(noteWord);
            if(i < 0){//if doesn't exist
                System.out.println("No");
                return;
            }
            noteMut.set(i, "");
        }
        System.out.println("Yes");
    }
}
