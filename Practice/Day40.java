
public class Day40 {

    public static int binToDec(int nums[]) {
        int bin = 0;
        for (int i = 0; i < nums.length; i++) {
            bin = (10 * bin) + nums[i];
        }
        // return bin;
        int pow = 0;
        int dec = 0;
        while (bin > 0) {
            int ld = bin % 10;
            dec += ld * Math.pow(2, pow);
            pow++;
            bin /= 10;
        }
        return dec;
    }

    public static void subArray(int nums[], int k) {
        int count = 0;
        for (int i = 0; i <= nums.length; i++) {
            for (int j = 0; j <= nums.length; j++) {
                int sum = 0;
                int idx = 0;
                for (int l = i; l < j; l++) {
                    sum += nums[l];
                    idx++;
                }
                if ((sum != 0 && idx != 0) && (sum * idx < k)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {

        // int arr[] = {1, 2, 3};
        // int k = 4;
        int arr[] = {1, 1, 1};
        int k = 5;
        // int arr[] = {1, 2, 3, 4, 5};
        // int k = 10;
        subArray(arr, k);

        // int arr[] = {1, 1, 1};
        // System.out.println(binToDec(arr));
    }
}
