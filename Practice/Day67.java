
public class Day67 {

    public static void dArr(int nums[][]) {
        for (int[] num : nums) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.print(num[j] + " ");
            }
            System.out.println();
        }
    }

    public static void find(int nums[][], int key) {
        int sm = Integer.MAX_VALUE;
        int lg = Integer.MIN_VALUE;
        for (int[] num : nums) {
            for (int j = 0; j < nums[0].length; j++) {
                if (num[j] > lg) {
                    lg = num[j];
                }
                if (num[j] < sm) {
                    sm = num[j];
                }
            }
        }
        System.out.println("largest : " + lg);
        System.out.println("smallest : " + sm);
    }

    public static void printSpiral(int nums[][]) {
        int top = 0, bottem = nums.length - 1, left = 0, right = nums.length - 1;
        while (top <= bottem && left <= right) {
            //top
            for (int i = top; i <= bottem; i++) {
                System.out.print(nums[top][i] + " ");
            }
            //right
            for (int i = left + 1; i <= bottem; i++) {
                System.out.print(nums[i][right] + " ");
            }
            //bottem
            for (int i = right - 1; i >= left; i--) {
                if (left == right) {
                    break;
                }
                System.out.print(nums[bottem][i] + " ");
            }
            //left
            for (int i = bottem - 1; i >= top + 1; i--) {
                if (top == bottem) {
                    break;
                }
                System.out.print(nums[i][left] + " ");
            }
            top++;
            left++;
            right--;
            bottem--;
        }
        System.out.println();
    }

    public static int diagonalSum(int nums[][]) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i][i];
        }
        sum = sum * 2;
        if (nums.length % 2 != 0) {
            sum = sum - nums[nums.length / 2][nums.length / 2];
        }
        return sum;
    }

    public static boolean  stairCaseSearch(int nums[][], int key) {
        int row = 0, col = nums.length-1;
        while (row < nums.length && col >= 0) {
            if (nums[row][col] == key) {
                System.out.println("The key is found at (" + row + "," + col + ")" );
                return true;
            } else if (nums[row][col] < key) {
                row++;
            } else {
                col--;
            }
        }
        System.out.println("Key now fount !");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        int nums[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        stairCaseSearch(matrix, 8);
        stairCaseSearch(nums, 8);
        // int nums[][] = {
        //     {1, 2, 3, 4, 5},
        //     {6, 7, 8, 9, 10},
        //     {11, 12, 13, 14, 15},
        //     {16, 17, 18, 19, 20},
        //     {21, 22, 23, 24, 25}
        // };
        // dArr(nums);
        // find(nums, 7);
        // printSpiral(nums);

    }
}
