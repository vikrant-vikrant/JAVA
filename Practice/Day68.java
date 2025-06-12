
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

    public static float getPath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);

            switch (dir) {
                case 'S' -> y--;
                case 'N' -> y++;
                case 'E' -> x++;
                default -> x--;
            }
        }
        return (float)Math.sqrt((x*x) + (y*y));
    }
    public static void main(String[] args) {

        // String path = "WNEENESENNN";
        // System.out.println(getPath(path));
        String word = "This is a, Cat";
        // String x = "racecar";
        // System.out.println(isPalindrome(x));
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
