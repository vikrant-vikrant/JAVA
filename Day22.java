
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

    //INVERTED & ROTATED HALF PYRAMID
    public static void invRotHalfPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //INVERTED HALF PYRAMID WITH NUMBERS
    //SOLVED BY OWN
    public static void inv_half_NumPyramid(int n) {
        int num = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            num -= 1;
        }
    }

    //FLOY'S TRIANGLE
    //SOLVED BY OWN
    public static void floyd_triangle(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num += 1;
            }
            System.out.println();
        }
    }

    //0-1 TRIANGLE
    public static void triangle0_1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((i + j) % 2 == 0 ? "1 " : "0 ");
            }
            System.out.println();
        }
    }

		//BUTTERFLY
    //SOLVED BY OWN
		public static void butterfly(int n){
			for(int i = 1;i<=n;i++){
				for(int j = 1;j<=i;j++){
					System.out.print("* ");
				}
				for(int j = (2*(n-i));j>0;j--){
					System.out.print("  ");
				}
				for(int j = 1;j<=i;j++){
					System.out.print("* ");
				}
				System.out.println();
			}
			for(int i = n;i>=1;i--){
				for(int j = 1;j<=i;j++){
					System.out.print("* ");
				}
				for(int j = (2*(n-i));j>0;j--){
					System.out.print("  ");
				}
				for(int j = 1;j<=i;j++){
					System.out.print("* ");
				}
				System.out.println();
			}
		}
    public static void main(String argu[]) {
			butterfly(5);
        // triangle0_1(5);
        // floyd_triangle(5);
        // inv_half_NumPyramid(5);
        // invRotHalfPyramid(10);
        // hollow_reactangle(5, 5);
        // hollow_reactangle(3, 5);
    }
}
