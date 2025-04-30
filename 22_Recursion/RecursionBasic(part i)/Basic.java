
public class Basic {
// Problem 1
// Print numbers from n to 1 (Decreasing Order)

    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }
// Problem 2
// Print numbers from n to 1 (Increasing Order)

    public static void printNum(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printNum(n - 1);
        System.out.print(n + " ");
    }
// Problem 3
// Print factorial of a number n.

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int fn = n * factorial(n - 1);
        return fn;
    }
// Problem 4
// Print sum of first n natural numbers.

    public static int sumN(int n) {
        if (n == 1) {
            return 1;
        }
        int sum = n + sumN(n - 1);
        return sum;
    }
// Problem 5
// Print Nth fibonacci number.

    public static int fibonacci(int n) {
        if (n == 0 | n == 1) {
            return n;
        }
        int fnm1 = fibonacci(n - 1);
        int fnm2 = fibonacci(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }
// Problem 6
// Check if a given array is sorted or not

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return isSorted(arr, i + 1);
    }
    // Problem 7
// WAF to find the first occurence of an element in an array

    public static void     public static void main(String args[]) {
        // int arr[] = {1, 2, 3, 4, 5, 6};
        int arr[] = {1, 2, 1, 4, 5, 6};
        System.out.println(isSorted(arr, 0));
        // System.out.println(fibonacci(5));
        // System.out.println(fibonacci(6));
        // System.out.println(fibonacci(32));
        // System.out.println(sumN(10));
        // System.out.println(factorial(5));
        // printNum(10);
        // System.out.println();
        // printDec(10);
    }
}
