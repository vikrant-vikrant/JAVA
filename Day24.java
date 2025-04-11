
public class Day24 {

    //MAX SUM OF SUBARRAYS(brute force)
    public static void maxSubarraysSum(int number[]) {
        int currSum;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum += number[k];
                }
                System.out.print(currSum + ", ");
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum : " + maxSum);
    }

    //MAX SUM OF SUBARRAYS(prefix sum)
    public static void maxSubArrSumPrefix(int number[]) {
        int currSum;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];
        prefix[0] = number[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + number[i];
        }
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                System.out.print(currSum + ", ");
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum : " + maxSum);
    }
    public static void main(String[] args) {
        int number[] = {2, 3, 4, 5, 6};
        maxSubArrSumPrefix(number);
        maxSubarraysSum(number);
    }
}
