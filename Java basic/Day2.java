import java.util.*;

public class Day2{
  public static void main(String args[]){
    // Output in Java
    System.out.println("Hello World");
    System.out.println("Hello vikrant");
    System.out.print("Hello kaka\n");
    System.out.print("Hello vishal");

  // Print Pattern
    System.out.println("****");
    System.out.println("***");
    System.out.println("**");
    System.out.println("*");

    // Variables in Java(variables, literal)
    int a = 10;
    int b = 10;
    System.out.println(a);
    System.out.println(b);
    System.out.println(a+b);
    System.out.println(b-a);
    System.out.println(b*a);
    System.out.println(b/a);
    System.out.println(b%a);
    String name = "vikrant";
    System.out.println(name);
    name = "vishal";
    System.out.println(name);
    a = 20;
    System.out.println(a);

    //Data Types in java(primitive, Non-primitive)
    // primitive data type (2)
    // 1-> non numeric
    boolean aaa = true; //true,false 1byte
    char bb = 'k'; //[a to z , A to Z , @ , %, !, #, $, &] 2bytes

    // 2-> numeric (2)
    // integer
    byte c = 9; //[-128 to 127] 256 1byte
    short d = 100; //2bytes
    int e = 89; 
    // long

    // floating point
    float f = 1.5f;
    // double

  //sum of a & b
  int x = 20;
  int y = 35;
  int sum = x + y;
  System.out.print("total = ");
  System.out.print(sum);

  /*
 bhai dekh java me comment aise likhte h 
 */
// haa bhai samjh gaya ache se

/*Input in Java
next,nextLine,nextInt,nextByte,nextFloat,nextDouble,nextBoolean,nextShort,nextLong*/
Scanner sc = new Scanner(System.in);
// String input = sc.next();
// System.out.println(input);

//to store with space
// String inp = sc.nextLine();
// System.out.println(inp);

//input for number 
int num = sc.nextInt();
System.out.println(num);

  }
}