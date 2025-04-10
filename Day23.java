public class Day23 {
    //SOLID RHOMBUS
    //SOLVED BY OWN
    public static void solidRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //HOLLOW RHOMBUS
    public static void hollow_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    //DIAMOND PATTERN
    public static void diamond(int n){
      //1st half
      for(int i = 1;i<=n;i++){
        for(int j =1;j<=n-i;j++){
          System.out.print("  ");
        }
        for(int k=1;k<=((i*2)-1);k++){
          System.out.print("* ");
          
        }
          System.out.println();
      }
      //2nd half
      for(int i = n;i>=1;i--){
        for(int j =1;j<=n-i;j++){
          System.out.print("  ");
        }
        for(int k=1;k<=((i*2)-1);k++){
          System.out.print("* ");
          
        }
          System.out.println();
      }
    }

    public static void main(String[] args) {
    //ARRAYS
    // int marks[] = new int[10];
        // diamond(5);
        // hollow_rhombus(7);
        // solidRhombus(7);
    }
}
