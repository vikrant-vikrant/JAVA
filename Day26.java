
public class Day26 {
    //HOLLOW REACRANGLE

    public static void reactangle(int n) {
        for (int i = 1; i <= n; i++) {
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

    //INVERTED & ROTATED HALF-PYRAMID
    public static void invRotHalfPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 0; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //INVERTED HALF-PYRAMID WITH NUMBERS
    public static void inv_half_NumPyramid(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("  ");
        }
    }

    //FLOYD'S TRIANGLE
    public static void floyd_triangle(int n) {
        int x = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(x + " ");
                x++;
            }
            System.out.println();
        }
    }

    //0-1 TRIANGLE
    public static void triangle0_1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    //BUTTERFLY
    public static void butterfly(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //SOLID RHOMBUS
    public static void solidRhombus(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= n; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //HOLLOW SOLID RHOMBUS
    public static void hollow_rhombus(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= n; k++) {
                if (k == 1 || k == n || i == 1 || i == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    //DAIMOND

    public static void diamond(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //NUMBER PYRAMID
    public static void numberPyramid(int n) {
        int x = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(x + " ");
            }
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            x++;
            System.out.println();
        }
    }

    //PALINDROMIC NUMBER
    public static void palindromicNum(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print("  ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }
            for (int k = 2; k <= i; k++) {
                System.out.print(k + " ");
            }

            System.out.println();
        }
    }

    //factotial
    public static long factorial(long n) {
        long x = 1;
        for (int i = 1; i <= n; i++) {
            x *= i;
        }
        return x;
    }
    //BINOMIAL COEFFICIENT
    public static long nCr(long n, long r){
      return factorial(n)/(factorial(r)*(factorial(n-r)));
    }
    public static void main(String args[]) {
      System.out.println(nCr(5, 2));
      // System.out.println(factorial(5));
        // factorial(5);
        // palindromicNum(5);
        // numberPyramid(5);
        // diamond(5);
        // hollow_rhombus(5);
        // solidRhombus(5);
        // butterfly(5);
        // triangle0_1(5);
        // floyd_triangle(5);
        // inv_half_NumPyramid(5);
        // invRotHalfPyramid(5);
        // reactangle(5);
    }
}
