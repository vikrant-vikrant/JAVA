
public class Day33 {

    public static void inverseStar(int n) {
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

    public static boolean binEven(int n) {
        return n % 10 == 0;
    }

    public static void sandClock(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("   ");
            }
            for (int k = 0; k <= (n * 2 - i * 2); k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("   ");
            }
            for (int k = 0; k <= (n * 2 - i * 2); k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static boolean elementApperence(int n[]) {
        for (int j = 0; j < n.length; j++) {
            for (int i = j + 1; i < n.length; i++) {
                if (n[i] == n[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String argu[]) {
        // int n[] = {1, 2, 3, 4};
        // System.out.println(elementApperence(n));
        // sandClock(3);
        // inverseStar(5);
        // System.out.println(binEven(111));
        // System.out.println(binEven(110));
    }
}
