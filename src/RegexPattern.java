import java.util.regex.Pattern;

public class RegexPattern {

    public static void main(String... args){
        String p = "([A-Z])(.+)";
//        String p = "[AZ[a-z](a-z)";
        try{
            Pattern.compile(p);
            System.out.println("Valid");
        }catch(Exception e){
            System.out.println("Invalid");
        }
    }
}
