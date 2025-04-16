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

    //exponentiation in Java
    double expo = Math.pow(a,b);
    System.out.println("exponentiation: " + expo);

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

  //Practice Questions
  //Average of three numbers
  System.out.println("Enter frist Number: ");
  int a1 = sc.nextInt();
  System.out.println("Enter Second Number: ");
  int a2 = sc.nextInt();
  System.out.println("Enter Third Number: ");
  int a3 = sc.nextInt();
  float avg = (a1 + a2 + a3)/3;
  System.out.println("Average of N numbers : " + avg);

  //Area of a square
  System.out.println("Enter the side of Square: ");
  int side = sc.nextInt();
  int ar = side * side;
  System.out.println("Area of Square: " + ar + "Unit2");

  //Items total cost + 18% GST tax
  System.out.println("Enter the Price of pencil: ");
  int pencil = sc.nextInt();
  System.out.println("Enter the Price of pen: ");
  int pen = sc.nextInt();
  System.out.println("Enter the Price of eraser: ");
  int eraser = sc.nextInt();
  int sum = pencil + pen + eraser;
  float totalPrice = sum + (sum * 18/100);
  System.out.print(totalPrice);

  int $ = 24;
  System.out.print($);

  }
}
