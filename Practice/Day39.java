
import java.util.Arrays;

public class Day39 {

    //buy & sell stock
    public static int stock(int arr[]) {
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (buyPrice < arr[i]) {
                int profit = arr[i] - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            } else {
                buyPrice = arr[i];
            }
        }
        return maxProfit;
    }

    //find the max sum of subArray
    public static void maxSubArraySum(int nums[]) {
        int maxSum = 0;
        for (int k = 0; k < nums.length; k++) {
            for (int i = k; i < nums.length; i++) {
                int sum = 0;
                for (int j = k; j <= i; j++) {
                    sum += nums[j];
                }
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println(maxSum);
    }

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

    public static void tolower(){
        for(char i='A';i<='Z';i++){
            System.out.print((char) (i|' ') + " ,");
        }
    }

    public static void main(String args[]) {
        tolower();
        System.out.println(~ ~9);
        System.out.println(-(~9));
        // int nums[] = {1,2,3,4,5};
        int nums[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Arrays.sort(nums);
        // int nums[] = {7, 1, 5, 3, 6, 4};
        // maxSubarraysSum(nums);
        maxSubArraySum(nums);
        // String name = "vikrant";
        // String name2 = "aivkntr";
        // char x[] = name.toCharArray();
        // Arrays.sort(x);
        // char y[] = name2.toCharArray();
        // Arrays.sort(y);
        // for(int i=0;i<x.length;i++){
        //   if(x[i] == y[i]){
        //   System.out.println(x[i]);
        //   }
        // }
        // char bb[] = name.toUpperCase().toCharArray();
        // for (int i = 0; i < nums.length; i++) {
        //     System.out.println(nums[i]);
        // }
        // int arr[] = {7,1,5,3,6,4};
        // System.out.println(stock(arr));
    }
}
