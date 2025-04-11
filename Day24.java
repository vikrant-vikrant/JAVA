
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

    //MAX SUM OF SUBARRAYS(kadane Algo)
    public static void kadaneAlgo(int number[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            currSum = currSum + number[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("max subarray sum : " + maxSum);
    }

    //TRAPPED RAINWATER
    public static int trappedRainwater(int height[]) {
        int n = height.length;
        //calculate left max boundery
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }
        // calculate right max boundery
        int rightmax[] = new int[n];
        rightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }
        int trappedWater = 0;
        //loop
        for (int i = 0; i < n; i++) {
            //waterLevel = min(leftmax, rightmax boundry)
            int waterLevel = Math.min(leftmax[i], rightmax[i]);
            //trapped water = waterlevel - height[i]
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }

    //max profit of stocks
    public static int buySellStock(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String args[]) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println("Max proft : " + buySellStock(prices));
        // int height[] = {4, 2, 0, 6, 3, 2, 5};
        // System.out.println(trappedRainwater(height));
        // int number[] = {2, 3, 4, 5, 6};
        // kadaneAlgo(number);
        // maxSubArrSumPrefix(number);
        // maxSubarraysSum(number);
    }
}
