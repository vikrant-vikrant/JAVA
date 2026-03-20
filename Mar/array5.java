
class array5 {

    public static void subArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
            }
            System.out.println();
        }
    }

    public static void maxSubArr(int arr[]) {
        int totalPair = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + ", ");
                }
                totalPair++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total pair =" + totalPair);
    }

    public static void maxSubArrSum(int arr[]) {
        int totalPair = 0, ms = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int cs = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + ", ");
                    cs += arr[k];
                }
                ms = Math.max(cs, ms);
                totalPair++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total pair =" + totalPair);
        System.out.println("Max sub array sum =" + ms);
    }

    public static void prefixSum(int nums[]) {
        int prefix[] = new int[nums.length], ms = Integer.MIN_VALUE, cs;
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                cs = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                ms = Math.max(cs, ms);
            }
        }
        System.out.println("Max sum = " + ms);
    }

    public static void kadaneAlgo(int nums[]) {
        int cs = 0, ms = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            cs += nums[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Max sum =" + ms);
    }

    // public static int trappedRainWater(int height[]){

    // }

    public static void main(String[] args) {
        // int list[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int list[] = {1, -2, 6, -1, 3};
        // int list[] = {1, 54, 432, 523};
        // int list[] = {1, 12, 23, 34, 45, 54, 432, 523};
        // subArr(list);
        // maxSubArr(list);
        maxSubArrSum(list);
        prefixSum(list);
        kadaneAlgo(list);
    }
}
