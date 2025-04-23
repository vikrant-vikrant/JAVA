
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
    public static float route(String str) {
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

    //substring
    public static String substing(String str, int si, int ei){
        String substr = "";
        for(int i=si;i<ei;i++){
            substr += str.charAt(i);
        }
        return substr;
    }  
    //TO UPPER CASE
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch= Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    } 

    //String Compression...
    public static String stringComp(String str){
        String newStr  = "";
        for(int i=0;i<str.length();i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count>1){
                newStr += count.toString();
            }
        }
        return newStr;
    }
    public static void main(String[] args) {
        String str = "abbcccdddd";
        System.out.println(stringComp(str));


        // String str = "hi, i am vikrant";
        // System.out.println(toUpperCase(str));


        // StringBuilder sb = new StringBuilder("");
        // for(char ch='a';ch<='z';ch++){
        //     sb.append(ch);
        // }
        // System.out.println(sb);

        // find the lexicographically largest
        // String fruits[] = {"apple", "mango", "banana"};
        // String largest = fruits[0];
        // for (String fruit : fruits) {
        //     if (largest.compareToIgnoreCase(fruit) < 0) {
        //         largest = fruit;
        //     }
        // }
        // System.out.println(largest);
        // String str = "HelloWorld";
        // System.out.println(substing(str, 0, 5));
        // System.out.println(substing(str, 5, str.length()));
        // System.out.println(str.substring(0, 5));
        // System.out.println(route("EWEWEWNSNSNS"));
        // System.out.println(route("WNEENESENNN"));

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
