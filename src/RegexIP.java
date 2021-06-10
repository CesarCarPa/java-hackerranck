import java.util.regex.*;

public class RegexIP {

    public static void main(String... args){
        String regex = "^(?:[0-9]{1,3}\\.){3}[0-9]{1,3}$";
        Pattern p = Pattern.compile(regex);

        String ip = "200.32.34.5";

        Matcher m = p.matcher(ip);

        System.out.println(m.matches());
    }
}
