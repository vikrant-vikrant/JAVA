public class Day7{
  public static void main(String args[]){
    //PATTERNS
    //Print STAR pattern
    
    for(int line = 1;line<=10;line++){
      for(int i = 1;i<=line;i++){
      System.out.print("*");
      }
      System.out.println();
    }
    //inverted STAR pattern

    System.out.println("inverted STAR pattern");
    for(int line = 10;line>=1;line--){
      for(int i = 1;i<=line;i++){
      System.out.print("*");
      }
      System.out.println();
    }
    //HALF PYRAMID pattern
    System.out.print("HALF PRAMID");
    int nub = 5;
    for(int i = 1;i<=nub;i++){
      for(int x = 1;x<=i;x++){
        System.out.print(x);
      }
        System.out.println();
    }
    //CHARACTER pattern
    System.out.println("CHARACTER pattern");
    char ch = 'a';
    int n = 5;
    for(int line = 1;line<=n;line++){
      for(int i = 1;i<=line;i++){
      System.out.print(ch);
      ch++;
      }
      System.out.println();
    }
    //HALF PYRAMID pattern
    System.out.println("INVERTED HALF PRAMID");
    int number = 5;
    for(int i = number;i>=1;i--){
      for(int x = 1;x<=i;x++){
        System.out.print(x);
      }
        System.out.println();
    }
    //FLOYD'S triangle
    System.out.println("FLOYD'S triangle");
    int a = 1;
    int nu = 5;
    for(int line = 1;line<=nu;line++){
      for(int i = 1;i<=line;i++){
      System.out.print(a +" ");
      a++;
      }
      System.out.println();
    }
    //0-1 triangle
    System.out.println("0-1 triangle");
    boolean bb = true;
    int cc = 5;
    for(int line = 1;line<=cc;line++){
      for(int i = 1;i<=line;i++){
        if(bb == true){
          System.out.print(1);
          bb = false;
        }else{
          System.out.print(0);
          bb = true;
        }
      }
      System.out.println();
    }
  }
}