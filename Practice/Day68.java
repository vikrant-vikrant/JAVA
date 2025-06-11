
public class Day68 {
    //palindrome worde

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String x = "racecar";
        System.out.println(isPalindrome(x));
        // char arr[] = {'a','b','c'};
        // String str = "koma l"; 
        // String str2 = new String("komal");

        // Strings are IMMUTEABLE
        // String name = sc.nextLine();
        // String Lastname = sc.nextLine();
        // System.out.println(name + Lastname);
        // System.out.println(name + " "+Lastname);
        // System.out.println(name.charAt(2));
        // System.out.println(name.length());
    }
}
