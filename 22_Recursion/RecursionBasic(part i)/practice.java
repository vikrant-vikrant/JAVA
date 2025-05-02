
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
    public static void main(String[] args) {
        intoStrint(123, new StringBuilder(""), 0);
        System.out.println();
        int nums[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        keyOccu(nums, 2, 0);
    }
}
