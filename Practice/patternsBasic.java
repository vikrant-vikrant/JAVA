
public class patternsBasic {

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

    public static void halfPyramid(int i) {
        for (int a = 1; a <= i; a++) {
            for (int b = 1; b <= i - a; b++) {
                System.out.print(" ");
            }
            for (int s = 1; s <= a; s++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void halfPyramidNum(int i) {
        for (int a = i; a >= 1; a--) {
            for (int s = 1; s <= a; s++) {
                System.out.print(s);
            }
            System.out.println();
        }
    }

    public static void floyd_triangle(int i) {
        int x = 1;
        for (int a = 1; a <= i; a++) {
            for (int s = 1; s <= a; s++) {
                System.out.print(x);
                x++;
            }
            System.out.println();
        }
    }

    public static void triangle0_1(int i) {
        int x = 1;
        for (int a = 1; a <= i; a++) {
            for (int s = 1; s <= a; s++) {
                System.out.print(x);
                if (x == 1) {
                    x = 0;
                } else {
                    x = 1;
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int i) {
        for (int a = 1; a <= i; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print("* ");
            }
            for (int s = (2 * (i - a)); s > 0; s--) {
                System.out.print("  ");
            }
            for (int b = 1; b <= a; b++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int a = i; a >= 1; a--) {
            for (int b = 1; b <= a; b++) {
                System.out.print("* ");
            }
            for (int s = (2 * (i - a)); s > 0; s--) {
                System.out.print("  ");
            }
            for (int b = 1; b <= a; b++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void solidRombus(int i) {
        for (int a = 1; a <= i; a++) {
            for (int s = 1; s <= i - a; s++) {
                System.out.print("  ");
            }
            for (int d = 1; d <= i; d++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hollow_reactangle(int i) {
        for (int a = 1; a <= i; a++) {
            for (int s = 1; s <= i - a; s++) {
                System.out.print("  ");
            }
            for (int d = 1; d <= i; d++) {
                if (a == 1 || a == i || d == 1 || d == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");

                }
            }
            System.out.println();
        }
    }

    public static void diamond(int i) {
        for (int a = 1; a <= i; a++) {
            for (int s = 1; s <= i - a; s++) {
                System.out.print("  ");
            }
            for (int d = 1; d <= a * 2 - 1; d++) {
                System.out.print(" *");
            }
            for (int s = 1; s <= i - a; s++) {
                System.out.print("  ");
            }
            System.out.println();
        }
        for (int a = i; a >= 1; a--) {
            for (int s = 1; s <= i - a; s++) {
                System.out.print("  ");
            }
            for (int d = 1; d <= a * 2 - 1; d++) {
                System.out.print(" *");
            }
            for (int s = 1; s <= i - a; s++) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void numberPyd(int i) {
        for (int a = 1; a <= i; a++) {
            for (int s = 1; s <= i - a; s++) {
                System.out.print(" ");
            }
            for (int d = 1; d <= a; d++) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }

    public static void PALINDROMI(int i) {
        for (int a = 1; a <= i; a++) {
            for (int s = 1; s <= i - a; s++) {
                System.out.print("  ");
            }
            for (int d = a; d >= 1; d--) {
                System.out.print(d + " ");
            }
            for (int d = 2; d <= a; d++) {
                System.out.print(d + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // for (int i = 1; i <= 10; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for (int i = 10; i >= 1; i--) {
        //     for (int j = i; j >= 1; j--) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for (int j = 1; j <= 5; j++) {
        //     for (int k = 1; k <= j; k++) {
        //         System.out.print(k);
        //     }
        //     System.out.println();
        // }
        // char ch = 'A';
        // int i = 5;
        // for (int j = 1; j <= i; j++) {
        //     for (int a = 1; a <= j; a++) {
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }
        // hollow_reactangle(5, 10);
        // halfPyramid(5);
        // halfPyramidNum(5);
        // floyd_triangle(5);
        // triangle0_1(5);
        // butterfly(4);
        // solidRombus(5);
        // hollow_reactangle(5);
        // diamond(4);
        // numberPyd(5);
        PALINDROMI(5);
    }
}
