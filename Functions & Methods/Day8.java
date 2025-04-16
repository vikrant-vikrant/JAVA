
// import java.util.*;

public class Day8 {

    public static void hey() {
        System.err.println("IT's coding time");
    }

    public static int sum(int a, int b) {//a & b are parameters
        int total = a + b;
        return total;
    }

    public static int product(int a, int b) {//a & b are parameters
        int product = a * b;
        return product;
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static int factorial(int a) {
        int fac = 1;
        for (int i = 1; i <= a; i++) {
            fac *= i;
        }
        return fac;
    }
    public static int nCr(int n, int r){
      return factorial(5)/(factorial(r)*factorial(n-r));
    }

    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // hey();
        // int a = sc.nextInt();//a & b are arguments
        // int b = sc.nextInt();
        // int x = sum(a, b);
        // System.out.println("Total sum is " + x);

        // swap(4, 5);

        // int xs = product(4, 5);
        // System.out.println(xs);

        System.out.println("Factorial to n! " + factorial(3));
        System.out.println("nCr = " + nCr(5, 2));

    }
}
