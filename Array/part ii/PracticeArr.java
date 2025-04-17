
public class PracticeArr {
    //Question 1:Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
    //Example 1:Input:nums = [1, 2, 3, 1]Output:   true 
    //Example 2:Input:nums = [1, 2, 3, 4]Output:   false

    public static boolean valueCheck(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (num == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    //Question 3:You  are  given  an  array prices where prices[i] is  the  price  of  a  given  stock  on  the ith day.Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0. 
    //Example 1:Input:prices = [7, 1, 5, 3, 6,  4]   Output:   5
    public static int stockProfit(int arr[]) {
        int profit = 0;
        for (int i = 0; i < arr.length; i++) {
            int buyPrice = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                int pro = buyPrice - arr[j];
                if (profit < pro) {
                    profit = pro;
                }
            }
        }
        return profit;
    }

    //Question 5:Given an integer array nums, return all the triplets [nums[i], nums[j],  nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.Notice that the solution set must not contain duplicate triplets.
    //Example 1:Input:nums = [-1, 0,  1, 2, -1, -4]   Output:   [ [-1, -1, 2] , [-1, 0, 1]
    public static void triplets(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.print("(" + arr[i] + "," + arr[j] + "," + arr[k] + ") ,");
                    }
                }
            }
        }
    }

    public static void main(String args[]) {
        int num[] = {-1, 0, 1, 2, -1, -4};
        triplets(num);
        // int num[] = {4, 2, 5, 6, 3, 2};
        // System.out.println("Profit : " + stockProfit(num));
        // System.out.println(valueCheck(num));
    }
}
