
public class Day22 {

    public static void hollow_reactangle(int rows, int colums) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= colums; j++) {
                if (i == 1 || i == rows || j == 1 || j == colums) {
                    System.out.print("*");
                } else {

                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String argu[]) {
        hollow_reactangle(5, 5);
        hollow_reactangle(3, 5);
    }
}
