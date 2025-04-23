public class BitwiseOperators {
  public static void main(String argu[]){
    //Binary AND &
    // 0 & 0 = 0
    // 0 & 1 = 0
    // 1 & 0 = 0
    // 1 & 1 = 1
    System.out.println(5 & 6);

    //Binary OR |
    // 0 | 0 = 0
    // 1 | 0 = 1
    // 0 | 1 = 1
    // 1 | 1 = 1
    System.out.println(5 | 6);
    
    //Binary XOR ^
    // 0 ^ 0 = 0
    // 0 ^ 1 = 1
    // 1 ^ 0 = 1
    // 1 ^ 1 = 0
    System.out.println(5 ^ 6);

    //Binary One's Complement ~
    // ~0 = 1
    // ~1 = 0
    System.out.println(~5 + 1);
    System.out.println(~7);

    //Binary Left Shift <<
    // a<<b = a*2^b
    // 5<<2
    System.out.println(5<<2);
    System.out.println(7<<3);

    //Binary Right Shift >>
    // a>>b = a/2^b
    System.out.println(7>>3);
    
  }
}