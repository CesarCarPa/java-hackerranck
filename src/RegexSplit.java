import java.util.stream.Stream;

public class RegexSplit {

    public static void main(String... args){
        String string = "";
        String[] words = string.trim().split("[ !,?._'@]+");
        System.out.println(words.length);
        Stream.of(words).forEach(System.out::println);


    }
}
