
public class practice {

    //QUESTION 1
    public static void keyOccu(int nums[], int key, int idx) {
        if (idx == nums.length) {
            return;
        }
        if (nums[idx] == key) {
            System.out.print(idx + " ");
            keyOccu(nums, key, idx + 1);
        } else {
            keyOccu(nums, key, idx + 1);
        }
    }

    //QUESTION 2
    public static void intoStrint(int n, StringBuilder str, int idx) {
        String list[] = {"zero ", "one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ", "nine "};
        if (n > 0) {
            int ld = n % 10;
            str.insert(0, list[ld]);
            n /= 10;
            intoStrint(n, str, idx + 1);
        } else {
            System.out.print(str);
        }
    }

    // PRACTICE
    public static int sumN(int n) {
        if (n == 1) {
            return 1;
        }
        // int sum = n;
        // sum += sumN(n - 1);
        // return sum;

        return n + sumN(n - 1);
    }

    //TOH
    // public static void TOH(int n, char A, char B, char C) {
    //     if (n == 0) {
    //         return ;
    //     }
    //     TOH(n - 1, A, B, C);
    //     System.out.println(A + "to " + C);
    //     TOH(n - 1, B, A, C);

    // }

    public static void main(String[] args) {
        System.out.println(sumN(5));
        System.out.println(sumN(101));
        // intoStrint(123, new StringBuilder(""), 0);
        // System.out.println();
        // int nums[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        // keyOccu(nums, 2, 0);
    }
}
