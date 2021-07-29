package arrays;

import java.util.regex.Pattern;

public class ReverseStringWithSpecialChars {

    public static void main(String[] args) {

        String string = "A$b%C^d@";
        System.out.println(string);
        System.out.println(reverseString(string));
    }

    static String reverseString(String string) {
        char[] chars = string.toCharArray();
        int start = 0, end = string.length()-1;
        while(end > start) {
            if(Character.isLetter(chars[start]) && Character.isLetter(chars[end])){
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            }
            if(!Character.isLetter(chars[start])){
                start++;
            }
            if(!Character.isLetter(chars[end])){
                end--;
            }
        }
        return String.valueOf(chars);
    }
}
