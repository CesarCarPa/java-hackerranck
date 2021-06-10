public class Anagram {

    public static void main(String[] args){

//        System.out.println(countOcurrences("anagrama", 'a'));
        System.out.println(isAnagram("NanAgram", "marganaN"));
    }

    public static boolean isAnagram(String a, String b){
        a = a.toLowerCase();
        b = b.toLowerCase();

        if(a.length() != b.length()){
            return false;
        }

        for (int i = 0; i < a.length(); i++) {
            if(countOcurrences(a, a.charAt(i)) != countOcurrences(b, a.charAt(i))){
                return false;
            }
        }

        return true;
    }

    private static int countOcurrences(String string, char charToCount){
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == charToCount){
                count ++;
            }
        }
        return count;
    }
}
