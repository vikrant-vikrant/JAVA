import java.util.*;
public class Day7_ii{
  //FUNCTIONS & METHODS
  public static void hey(){
    System.out.println("Hey it's new function");
  }

  public static void print(int x){
    System.out.println("NUMBERS");
    for(int i = 1;i<=x;i++){
      System.out.println(i);
    }
  }

  public static int add(int a , int b) {
    int sum = a + b;
    return sum;
  }

  public static void main(String args[]){
    print(12);
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int total = add(a, b);
    System.err.println("Total sum is :" + total);
  }
}