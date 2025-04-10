import java.util.Scanner;
import java.util.*;
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
    public static void diamond(int n) {
        //1st half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= ((i * 2) - 1); k++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        //2nd half
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= ((i * 2) - 1); k++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }

    //Arrays as Function Arguments
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 2;
        }
    }

    //LINEAR SEARCH
    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    //LARGEST & SMALLEST NUMBER
    //SOLVED BY OWN
    public static int largestNum(int num[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 1; i < num.length; i++) {
            if (num[i] > largest) {
                largest = num[i];
            }
            if (num[i] < smallest) {
                smallest = num[i];
            }
        }
        System.out.println("Smallest number : " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int marks[] = {10, 20, 30, 40, 50, 40, 5, 32, 11};
        int biggestNum = largestNum(marks);
        System.out.println("Largest number : " + biggestNum);

        int key = 40;
        int index = linearSearch(marks, key);
        if (index == -1) {
            System.out.println("NOT found");
        } else {
            System.out.println("KEY is at  index : " + index);
        }
        // ARRAYS
        update(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("maths " + marks[0]);
        System.out.println("hindi " + marks[1]);
        marks[2] = 100;
        System.out.println("english " + marks[2]);
        System.out.println("Length " + marks.length);
        // diamond(5);
        // hollow_rhombus(7);
        // solidRhombus(7);
    }
}
