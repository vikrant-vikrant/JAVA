import java.util.*;
public class Day6{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    //Loops(while loop, for Loop, do while Loop)

    //while Loop
    //sum of first N natural number
    System.out.println("Enter the number");
    int n = sc.nextInt();
    int counter = 1;
    int sum = 0;
    while(counter <= n){
      System.out.println( counter );
      sum += counter;
      counter ++;
    }
    System.out.println("total sum : " + sum);

    //for Loop
    for(int z = 1;z<=10;z++){
      System.out.println(z*z);
    }
    for(int z = 1;z<=4;z++){
      System.out.println("****");
    }
    
    //print reverse of a number
    int bb = 9871;
    while(bb>0){
      int lastdigit = bb % 10;
      System.out.print(lastdigit);
      bb /= 10;
    }

    //reverse the given number
    System.out.println("Enter the number to reverse");
    int nmb = sc.nextInt();
    int rev = 0;
    while(nmb>0){
      int x = nmb % 10;
      rev = (rev * 10) + x;
      nmb /= 10;
    }
    System.out.println(rev);

    //do while loop
    int aa = 1;
    do{
      System.out.println("hey");
      aa++;
    }while(aa<10);

    //break
    for(int i = 1;i<10;i++){
      if(i==3){
        break;
      }
      System.out.println(i);
    }

    do{
      System.out.println("Enter your number :");
      int cc = sc.nextInt();
      if(cc % 10 == 0){
        break;
      }
    }while(true);

    // Continue Statment(to skip an iteration)
    for(int i = 1;i<5;i++){
      if(i == 3){
        continue;
      }
      System.out.println(i);
    } 

    //print all number enter by user expect multiple of 10
    System.out.println("Enter your number :");
    int nm = sc.nextInt();
    for(int i = 1;i<=nm;i++){
      if(i % 10 == 0){
        continue;
      }
      System.out.println(i);
    }

  // do{
  //   System.out.println("Enter the number : ");
  //   int x = sc.nextInt();
  //   if(x % 10 == 0){
  //     continue;
  //   }
  //   System.out.println("The number was " + x);
  // }while(true);

  //check if number is prime or not
    System.out.println("Enter your number : ");
    int z  = sc.nextInt();
    boolean isPrime = true;
    if(z == 2){
      isPrime = true;
    }else{
      for(int i = 2; i<Math.sqrt(z) ; i++){
        if(z % i == 0){
          isPrime = false;
        }
      }
    }
    if(isPrime == true){
      System.out.println("Prime number ");
    }else{
      System.out.println("not a Prime number ");
    }

    //Practice 
    //Reverse of number
    int i = 298767;
    while(i>0){
    int x = i % 10;
    System.out.print(x);
    i /= 10;
    }

    //Reverse of a given number
    int j = 9823;
    int reve = 0;
    while(j>0){

    int lastDigit = j % 10;
    reve = (reve * 10) + lastDigit;
    j /= 10;
    }
    System.out.println(reve);

    do{
      int lastDigit = j % 10;
    reve = (reve * 10) + lastDigit;
    j /= 10;
    }while(j>0);
    System.out.println(reve);

    //break & continue
    for(int ic = 10 ;ic < 100;ic+= 10){
      if(ic == 50){
        break;
      }
      System.out.println(i);
    }
    for(int id = 10 ;id < 100;id+= 10){
      if(id == 50){
        continue;
      }
      System.out.println(id);
    }


  //if a number is prime or not
  int nub = sc.nextInt();
  boolean isP = true;
  if(nub == 2){
  isP = true;
  }else{
    for(int ii = 2;ii<=nub - 1;ii++){
      if(nub % ii == 0){
        isP = false;
        break;
      }
    }
  }
  if(isP == true){
    System.out.println("Prime number");
  }else{
    System.out.println("Not a Prime number");
  }

  int M = 24689173;
  int odd = 0;
  int even = 0;
  do{
    int lastD = M % 10;
    if(lastD % 2 == 0){
    even += lastD;
    }else{
    odd += lastD;
    }
    M /= 10;
  }while(M > 0);

  System.out.println("Sum of total even is "
   + even);
  System.out.println("Sum of total odd is "
   + odd);
  System.out.println("Enter the number to find factorial");
  int f = sc.nextInt();
  long factorial = 1;
  for(int ix = f; ix > 0; ix--){
    factorial = factorial * ix;
  }
  System.out.println(factorial);


  System.out.println("Enter the number to print table :");
  int ff = sc.nextInt();
  for(int ai = 1 ; ai <= 10; ai++){
    System.out.println( ff + " * " + ai + " = " + ff*ai);
  }
  }
}