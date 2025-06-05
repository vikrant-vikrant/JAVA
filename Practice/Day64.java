
public class Day64 {

    //MAX SUM OF SUBARRAYS(brute force)
    public static int maxSubarraysSum(int nums[]) {
        int currSum;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += nums[k];
                }
                maxSum = Math.max(maxSum, currSum);
            }
        }
        return maxSum;
    }


    //prefix sum
    public static int maxSubArrSumPrefix(int nums[]){
      int currSum,maxsum = Integer.MIN_VALUE;
      int prefix[] = new int[nums.length];
      prefix[0] = nums[0];
      for(int i=1;i<nums.length;i++){
        prefix[i] = prefix[i-1] + nums[i];
      }
      for(int i=0;i<nums.length;i++){
        for(int j=i;j<nums.length;j++){
          currSum = i==0?prefix[j]:prefix[j]-prefix[i-1];
          maxsum = Math.max(maxsum, currSum);
        }
      }
      return maxsum;

    }

    public static int kadaneAlgo(int nums[]){
      int currSum=0,maxsum = Integer.MIN_VALUE;
      for(int i=0;i<nums.length;i++){
        currSum = currSum + nums[i];
        if(currSum < 0){
          currSum = 0;
        }
        maxsum = Math.max(maxsum, currSum);
      }
      return maxsum;
    }
    public static void main(String[] args) {
        // int nums[] = {2, 4, 6, 8, 10};
        int nums[] = {1, -2, 6, -1, 3};
        System.out.println(kadaneAlgo(nums));
        // System.out.println(maxSubArrSumPrefix(nums));
        // System.out.println(maxSubarraysSum(nums));
    }
}
