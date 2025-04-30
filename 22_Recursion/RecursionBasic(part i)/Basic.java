public class Basic{
// Problem 1
// Print numbers from n to 1 (Decreasing Order)
  public static void printDec(int n){
    if(n==1){
      System.out.println(n);
      return;
    }
    System.out.print(n+" ");
    printDec(n-1);
  }
// Problem 2
// Print numbers from n to 1 (Increasing Order)
public static void printNum(int n){
  if(n == 1){
    System.out.print(n+" ");
    return;
  }
  printNum(n-1);
  System.out.print(n+" ");
}
// Problem 3
// Print factorial of a number n.
public static int factorial(int n){
  if(n==0){
    return 1;
  }
  int fn = n * factorial(n-1);
  return fn;
}
// Problem 4
// Print sum of first n natural numbers.
public static int sumN(int n){
  if(n==1){
    return 1;
  }
  int sum = n + sumN(n-1);
  return sum;
}
// Problem 5
// Print Nth fibonacci number.
// public static int fibonacci(int n){

// }
  public static void main(String args[]){
    System.out.println(sumN(10));
    System.out.println(factorial(5));
    // printNum(10);
    // System.out.println();
    // printDec(10);
  }
}