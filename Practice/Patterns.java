
import java.util.Scanner;

public class Patterns {

    //FUNCTIONS/METHODS
    public static void hey() {
        System.out.println("i am again back");
    }

    public static void print(int x) {
        System.out.println("Numbers");
        for (int i = 1; i <= x; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public static void calc(int a, int b) {
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
    }

    public static void main(String[] args) {

        hey();
        print(10);
        calc(10, 5);
        //PATTERNS
        //Print STAR pattern
        for (int i = 1; i <= 5; i++) {
            for (int n = 1; n <= i; n++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        //inverted STAR pattern
        for (int i = 5; i >= 1; i--) {
            for (int n = i; n >= 1; n--) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        //HALF PYRAMID pattern
        for (int i = 1; i <= 5; i++) {
            for (int n = 1; n <= i; n++) {
                System.out.print(n);
            }
            System.out.println("");
        }

        //CHARACTER pattern
        char ch = 'A';
        int n = 5;
        for (int line = 1; line <= n; line++) {
            for (int i = 1; i <= line; i++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println("");
        }
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calc(a, b);
    }
}
