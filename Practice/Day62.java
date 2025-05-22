
public class Day62 {
    //total pairs in arr

    public static void pairInArr(int arr[]) {
        int tp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs " + tp);
    }

    //subarrays
    public static void subArrays(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + ", ");
                }
                System.out.println();

            }
            System.out.println();
        }
    }

    //MAX SUB ARRAYS SUM
    public static void maxSubarraysSum(int nums[]) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += nums[k];
                    maxSum = Math.max(maxSum, currSum);
                }
            }
        }
        System.out.println(maxSum);
    }

    //PRIFIX SUM
    public static void prifixSum(int nums[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum;
        int[] prifix = new int[nums.length];
        prifix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prifix[i] = prifix[i - 1] + nums[i];
        }
        for (int j = 0; j < nums.length; j++) {
            for (int k = j; k < nums.length; k++) {
                currSum = j == 0 ? prifix[k] : prifix[k] - prifix[j - 1];
                maxSum = Math.max(maxSum, currSum);
            }
        }
        System.out.println(maxSum);
    }

    //kadaneAlgo
    public static void kadaneAlgo(int nums[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println(maxSum);
    }

    //kadaneAlgo for negative num
    public static int kadaneforAll(int nums[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        if (isNegative(nums) == true) {
            for (int i = 0; i < nums.length; i++) {
                maxSum = Math.max(maxSum, nums[i]);
            }
        } else {
            for (int i = 0; i < nums.length; i++) {
                currSum += nums[i];
                if (currSum < 0) {
                    currSum = 0;
                }
                maxSum = Math.max(maxSum, currSum);
            }
        }
        return maxSum;
    }

    public static boolean isNegative(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //MAX SUB ARRAYS SUM
        // int nums[] = {1, -2, 6, -1, 3};
        // int nums[] = {-1, -2, -6, -1, -3};
        // System.out.println(kadaneforAll(nums));
        // System.out.println(isNegative(nums));

        // kadaneAlgo(nums);
        // prifixSum(nums);
        // maxSubarraysSum(nums);
        // subarrays
        // int arr[] = {1, 2, 3, 4, 5};
        // subArrays(arr);
        //pairs in arr
        // int arr[] = {1,2,3,4,5};
        // pairInArr(arr);
    }
}
