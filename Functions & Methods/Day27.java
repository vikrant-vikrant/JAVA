
public class Day27 {

    //is prime or not 
    public static boolean isPrime(int n) {
        boolean isP = true;
        if (n == 2) {
            return isP;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isP = false;
                break;
            }
        }
        return isP;
    }

    //Prime in a range
    public static void primeInRange(int n) {
        for (int i = 1; i <= n; i++) {
            if (isPrime(i) == true) {
                System.out.print(i + " ");
            }
        }
    }

    //Binary to Decimal
    public static int binToDec(int n) {
        int num = 0;
        int i = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            num += lastDigit * Math.pow(2, i);
            n /= 10;
            i++;
        }
        return num;
    }

    //Decimal to binary
    public static long decToBin(int n) {
        long num = 0;
        int pow = 0;
        while (n > 0) {
            int lastDigit = n % 2;
            num += lastDigit * (int) Math.pow(10, pow);
            n /= 2;
            pow++;
        }
        return num;
    }

    //palindrome
    public static void isPalindrome(int n) {
        int digit = n;
        int palindrome = 0;
        while (digit > 0) {
            int lastDigit = digit % 10;
            palindrome = (10 * palindrome) + lastDigit;
            digit /= 10;
        }
        if (n == palindrome) {
            System.out.println(n + " is a palindrome");
        } else {
            System.out.println(n + " is not a palindrome");
        }
    }

    public static void main(String argu[]) {
        isPalindrome(123);
        // System.out.println(decToBin(8));
        // System.out.println(binToDec(1011));
        // primeInRange(100);
        // System.out.println(9/2);

    }
}
