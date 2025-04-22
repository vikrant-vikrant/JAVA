
public class stringBasic {

    //palindrome word
    public static boolean palindromeWord(String str) {
        for (int i = 0; i <= str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    //direction question
    public static float  route(String str) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < str.length(); i++) {
            char dir = str.charAt(i);
            switch (dir) {
                case 'E' ->
                    x++;
                case 'W' ->
                    x--;
                case 'N' ->
                    y++;
                default ->
                    y--;
            }
        }
        return (float) Math.sqrt(x * x + y * y);
    }

    //substing
    public static void main(String[] args) {
      System.out.println(route("EWEWEWNSNSNS"));
      System.out.println(route("WNEENESENNN"));
        
        // String name = "vikrant";
        // String name1 = "madam";
        // System.out.println("Is palindrome word : " + palindromeWord(name));
        // System.out.println("Is palindrome word : " + palindromeWord(name1));

        //strings are IMMUTABLE
        // char arr[] = {'a','b','c','d'};
        // String str = "abcd";
        // String str1 = "vikrnat";
        // System.out.println(str);
        // System.out.println(str1);
        // System.out.println(arr);
        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);
        // String name = "vikrnat verma";
        // String name2 = "vishal";
        // System.out.println(name.length());
        // System.out.println(name.indexOf("r"));
        // System.out.println(name2.charAt(3));
        // for(int i=0;i<name.length();i++){
        //   System.out.print(name.charAt(i) + " ");
        // }
        //concatenation
        // System.out.println(name + name2);
    }
}
