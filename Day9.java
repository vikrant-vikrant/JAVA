
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

    public static void primeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void binToDec(int bin) {
        int myNum = bin;
        int pow = 0;
        int dec = 0;
        while (bin > 0) {
            int lastDigit = bin % 10;
            dec = dec + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            bin /= 10;
        }
        System.out.println("Decimal form of " + myNum + " is " + dec);
    }

    public static void decToBin(int dec) {
        int myNum = dec;
        int pow = 0;
        int bin = 0;
        while (dec > 0) {
            int lastDigit = dec % 2;
            bin = bin + (lastDigit * (int) Math.pow(10, pow));
            pow++;
            dec /= 2;
        }
        System.out.println("Binary form of " + myNum + " is " + bin);
    }

    public static int averOfThree(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    public static boolean isEven(int a) {
        boolean even = false;
        if (a % 2 == 0) {
            even = true;
        }
        return even;
    }

    public static void isPalindrome(int x) {
        int num = x;
        int lastDigit;
        int newNum = 0;
        while (x > 0) {
            lastDigit = x % 10;
            newNum = (newNum * 10) + lastDigit;
            x /= 10;
        }
        if (num == newNum) {
            System.out.println(newNum + " is a Palindrome number");
        } else {
            System.out.println(newNum + " is not a Palindrome number");
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

    public static boolean total(int x) {
        int lastDigit;
        int sumOfNum = 0;
        while (x > 0) {
            lastDigit = x % 10;
            sumOfNum += lastDigit;
            x /= 10;
        }
        return isPrime(sumOfNum);
    }

    public static void main(String args[]) {
        //FUNCTION OVERLOADING
        System.out.println(sum(4, 5));
        System.out.println(sum(4, 5, 6));
        System.out.println(sum(4.8f, 1.4f));

        System.out.println(checkPrime(19));
        System.out.println(checkPrime(12));
        System.out.println(isPrime(31));
        primeInRange(100);
        binToDec(1011);
        binToDec(1111);
        binToDec(010101);
        decToBin(11);
        decToBin(15);
        decToBin(49);
        System.out.println(averOfThree(3, 6, 9));
        System.out.println(isEven(14));
        System.out.println(isEven(13));
        isPalindrome(12321);
        isPalindrome(123);
        System.out.println(total(123));
        System.out.println(total(676));

    }
}
