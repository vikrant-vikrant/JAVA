import java.util.*;
public class Day5 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    //if else condition
    System.out.print("Enter your age: ");
    int age = sc.nextInt();
    if(age>=18) {
      System.out.println("You are an adult");
      System.out.println("You can vote, Drive and Drink ");
    }if(age > 13 && age < 18){
      System.out.println("You'r teenage");
    }
    else{
      System.out.println("You are a child");
    }

    //largest of 2 number
    System.out.println("Enter the frist number : ");
    int a = sc.nextInt();
    System.out.println("Enter the second number : ");
    int b = sc.nextInt();
    if(a>b){
      System.out.println(a + " is grater then " + b);
    }
    else{
      System.out.println(b + " is grater then " + a);
    }

    //odd vs even
    System.out.println("Enter the number : ");
    int c = sc.nextInt();
    if(c%2== 0){
      System.out.println("The number is EVEN ");
    }else{
      System.out.println("The number is ODD ");
    }

    //else if Statement
    System.out.println("Enter you age : ");
    int Age = sc.nextInt();
    if(Age > 18){
      System.out.println("adult");
    }else if(Age >= 13 && Age < 18){
      System.out.println("Teenage");
    }else{
      System.out.println("Child");
    }

    //Tax calculator
    System.out.println("Enter your income ");
    int income = sc.nextInt();
    int tax;
    if(income >= 500000 && income < 1000000){
      tax = (int)(income * .2f) ;
      System.out.println("You have to pay 20% TAX : " + tax );
    }else if(income > 1000000){
      tax = (int)(income * .3f) ;
      System.out.println("You have to pay 30% TAX : " + tax );
    }else{
      System.out.println("You don't need to pay tax,");
    }

    //largest of 3 number
    System.out.println("Enter Frist number :");
    int x = sc.nextInt();
    System.out.println("Enter second number :");
    int y = sc.nextInt();
    System.out.println("Enter third number :");
    int z = sc.nextInt();
    if(x> y && x > z){
      System.out.println(x + " is largest number");
    }else if(y > z){
      System.out.println(y + " is largest number");
    }else{
      System.out.println(z + " is largest number");
    }

    if(x > y){
      if(x > z){
        System.out.println(x + " is largest number");
      }else{
        System.out.println(z + " is largest number");
      }
    }else{
      if(y>z){
        System.out.println(y + " is largest number");
      }else{
        System.out.println(z + " is largest number");
      }
    }

    //Ternary oprator
    int num = (5>3)?5:3;
    System.out.println(num);

    int marks = 45;
    String result = (marks>=33)?"pass":"fail";
    System.out.println(result);

    //Switch statement
    int q = 1;
    switch(q){
      case 1 : System.out.println("samosa");
              break;
      case 2 : System.out.println("burger");
              break;
      case 3 : System.out.println("ice cream");
              break;
      default : System.out.println("day dreaming");
    }

    float m = sc.nextFloat();
    char oprator = sc.next().charAt(0);
    float n = sc.nextFloat();
    switch(oprator){
      case '+' : System.out.println( m + n);
              break;
      case '-' : System.out.println(m - n);
              break;
      case '*' : System.out.println( m * n);
              break;
      case '/' : System.out.println( m / n);
              break;
      case '%' : System.out.println( m % n);
              break;
      default : System.out.println("wrong input");
    }

    //practice questions
    System.out.println("Enter number number");
    int number = sc.nextInt();
    if(number>0){
      System.out.println("Positive number");
    }else{
      System.out.println("Negative number");
    }

    double temp = 103.5d;
    if(temp > 100){
      System.out.println("You have fever");
    }else{
      System.out.println("Just normal");
    }


    System.out.println("Enter the day :");
    int day = sc.nextInt();
    switch(day) {
      case 1 :System.out.println("Monday");
                break;
      case 2 :System.out.println("Tuseday");
                break;
      case 3 :System.out.println("Wednesday");
                break;
      case 4 :System.out.println("Thursday");
                break;
      case 5 :System.out.println("Friday");
                break;
      case 6 :System.out.println("Saturday");
                break;
      case 7 :System.out.println("Funday");
                break;
      default: System.out.println("Wrong input !");
    }

    System.out.println("Enter the Year :");
    int year = sc.nextInt();
    if(year % 4 == 0){
      System.out.println("Leap year");
    }else{
      System.out.println("not a Leap year");
    }
  }
}
