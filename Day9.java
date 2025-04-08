
public class Day9 {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static float sum(float a, float b) {
        return a + b;
    }

    public static boolean checkPrime(int n) {
        if (n == 2) {
            return true;
        } else {
            for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void primeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void binToDec(int bin) {
        int pow = 0;
        int dec = 0;
        while (bin > 0) {
            int lastDigit = bin % 10;
            dec = dec + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            bin /= 10;
        }
        System.out.println(dec);
    }

    public static void main(String[] args) {
        //FUNCTION OVERLOADING
        // System.out.println(sum(4, 5));
        // System.out.println(sum(4, 5, 6));
        // System.out.println(sum(4.8f, 1.4f));

        // System.out.println(checkPrime(19));
        // System.out.println(checkPrime(12));
        // System.out.println(isPrime(31));
        // primeInRange(100);
        binToDec(1011);
        binToDec(1111);
        binToDec(010101);
    }
}
