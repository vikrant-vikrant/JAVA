
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

    public static int firstOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurence(arr, key, i + 1);
    }
// Problem 8
// WAF to find the last occurence of an element in an array

    public static int lastOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, key, i + 1);
        if (isFound != -1) {
            return isFound;
        }
        //check with self
        if (arr[i] == key) {
            return i;
        }
        return isFound;
    }
// Problem 9
// Print x^n
// public static int pow(int x,int n){
//     if(n == 1){
//         return x;
//     }
//     return x * pow(x, n-1);
// }

    public static int pow(int x, int n) {
        if (n == 1) {
            return x;
        }
        int halfPower = pow(x, n / 2);
        int halfPowerSq = halfPower * halfPower ;
        if (n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }
// Problem 11
// Tiling Problem Approach
public static int tilingProblem(int n){
    //base case
    if(n==0 | n==1){
        return 1;
    }
    //vertical choice
    int fnm1 = tilingProblem(n-1);

    //horizontal choice 
    int fnm2 = tilingProblem(n-2);
    int totalWays = fnm1 + fnm2;
    return totalWays;
}
// Problem 12
// Remove Duplicates in a String
public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
    if(idx == str.length()){
        System.out.println(newStr);
        return;
    }
    char currChar = str.charAt(idx);
    if(map[currChar - 'a'] == true ){
        removeDuplicates(str, idx+1, newStr, map);
    }else{
        map[currChar-'a'] = true;
        removeDuplicates(str, idx, newStr.append(currChar), map);
    }
}
    public static void main(String args[]) {
        removeDuplicates("apnacollege", 0, new StringBuilder(""), new boolean[26]);
        // System.out.println(tilingProblem(5));
        // System.out.println(tilingProblem(4));
        // System.out.println(tilingProblem(3));
        // System.out.println(pow(3, 3));
        // int arr[] = {1, 2, 1, 4, 5, 6, 2, 5, 6};
        // System.out.println(lastOccurence(arr, 5, 0));
        // System.out.println(firstOccurence(arr, 5, 0));
        // System.out.println(isSorted(arr, 0));
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
