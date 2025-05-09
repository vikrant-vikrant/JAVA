
public class Day51 {

    //brute force
    public static void subarray(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        for (int k = 0; k < arr.length; k++) {
            for (int i = k; i < arr.length; i++) {
                int sum = 0;
                for (int j = k; j <= i; j++) {
                    // System.out.print(arr[j] + ", ");
                    sum += arr[j];
                }
                maxSum = Math.max(maxSum, sum);
                // System.out.println();
            }
        }
        System.out.println("max sum = " + maxSum);
    }

    //prefix sum
    public static void prefixSum(int arr[]) {
        int currSum;
        int maxSum = Integer.MIN_VALUE;
        int newArr[] = new int[arr.length];
        newArr[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            newArr[i] = newArr[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int st = i;
            for (int j = 0; j < arr.length; j++) {
                int end = j;
                currSum = st == 0 ? newArr[end]:newArr[end] - newArr[st-1];
                maxSum = Math.max(maxSum, currSum);
            }
        }
        System.out.println(maxSum);
    }
    //kadane algo
    public static void kadaneAlgo(int arr[]){
        int currSum=0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currSum += arr[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        // int arr[] = {1, -2, 6};
        int arr[] = {2, 4, 6, 8, 10};
        // int arr[] = {1, -2, 6, -1, 3};
        // int[] arr = {1, 2, -5, 4, 6};

        subarray(arr);
        prefixSum(arr);
        kadaneAlgo(arr);
    }
}
