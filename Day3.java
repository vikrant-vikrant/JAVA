import java.util.*;

public class Day3 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter frist number :");
    int a = sc.nextInt();
    System.out.print("Enter second number :");
    int b = sc.nextInt();

    //sum of a & b
    int sum = a + b;
    System.out.println("sum: "+ sum );

    //product of a & b
    int product = a * b;
    System.out.println("Product: "+ product );

    
    //Type Conversion
    //byte -> short -> int -> float -> long -> double
    
    //area of a circle
    System.out.println("Enter the radish");
    float R = sc.nextInt();
    double area = 3.14f * R * R ;
    System.out.println("Area of Circle " + area);

    //Type Casting
    float c = 12.8f;
    int d = (int)c;
    System.out.print(d);

    //Type Promotion in Expressions
    char e = 'e';
    char f = 'f';
    System.out.println((int)(e));
    System.out.println((int)(f));
    System.out.println(f - e);

    short g = 5;
    byte h = 3;
    char i = 'i';
    byte total = (byte) (g + h + i);
    System.out.println(total);

    int j = 10;
    float k = 10.45f;
    long l = 23;
    double m = 32;
    double ans = j + k + l + m;
    System.out.println(ans);
    int ans2 = (int)(j + k + l + m);
    System.out.println(ans2);

    byte n = 4;
    byte mul = (byte)(n * 2);
    System.out.println(mul);
  }
}
