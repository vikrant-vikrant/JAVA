
import java.util.Arrays;

public class StringPractice {
    //vowel counter

    public static int vowelCount(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'a' ->
                    count++;
                case 'e' ->
                    count++;
                case 'i' ->
                    count++;
                case 'o' ->
                    count++;
                case 'u' ->
                    count++;
                default -> {
                }
            }
        }
        return count;
    }

    //ANAGRAMS
    public static boolean anagrams(String a, String b) {
        String str1 = a.toLowerCase();
        String str2 = b.toLowerCase();
        boolean result = false ;
        if (str1.length() == str2.length()) {
            char[] str1CharArray = str1.toCharArray();
            char[] str2CharArray = str2.toCharArray();

            Arrays.sort(str1CharArray);
            Arrays.sort(str2CharArray);
            result = Arrays.equals(str1CharArray, str2CharArray);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(anagrams("cat", "tac"));
        System.out.println(anagrams("rbq", "tac"));

        // String name = "aeeiiioooo";
        // String name = "vikrant";
        // System.out.println("Total vowel : " + vowelCount(name));
        // String str = "ShradhaDidi";
        // String str1 = "ApnaCoIIege";
        // String str2 = "ShradhaDidi";
        // System.out.println(str.equals(str1) + " " + str.equals(str2));
        // System.out.println("ApnaCollege".replace("l", ""));
    }
}
