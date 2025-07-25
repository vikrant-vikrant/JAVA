
public class functions {

    public static int product(int a, int b) {
        return a * b;
    }

    public static Integer factorial(int n) {
        Integer x = 1;
        for (int i = 1; i <= n; i++) {
            x *= i;
        }
        return x;
    }

    public static Integer binomialCoeffient(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i) == true) {
                System.out.print(i + " ");
            }
        }
    }

    public static void BintoDec(int n) {
        int z = n;
        int num = 0;
        int x = 0;
        while (n > 0) {
            num += (n % 10) * (int) Math.pow(2, x);
            x++;
            n /= 10;
        }
        System.out.println("Decimal of " + z + " = " + num);
    }

    public static void DectoBin(int n) {
        int num = 0;
        int x = 0;
        while (n > 0) {
            num += (n % 2) * (int) Math.pow(10, x);
            x++;
            n /= 2;
        }
        System.out.println(num);
    }

    public static void main(String[] args) {

        BintoDec(11001);
        BintoDec(100110);
        DectoBin(8);
        DectoBin(13);
        // System.out.println(product(5, 7));
        // System.out.println(factorial(6));
        // System.out.println(factorial(0));
        // System.out.println(binomialCoeffient(5, 2));
        // System.out.println(isPrime(19));
        // System.out.println(isPrime(10));
        // primeRange(100);
    }
}
