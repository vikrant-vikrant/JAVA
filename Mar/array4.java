
public class array4 {

    public static void prefixSum(int arr[]) {
        int cs, ms = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                cs = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                if (cs > ms) {
                    ms = cs;
                }
            }
        }
        System.out.println("Max sum = " + ms);
    }

    public static void kadaneAlgo(int arr[]) {
        int cs = 0, ms = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            cs += arr[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Max sum = " + ms);
    }

    public static void main(String args[]) {
        // int list[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        // int list[] = {1, -2, 6, -1, 3};
        // int list[] = {1, 54, 432, 523};
        int list[] = {1, 12, 23, 34, 45, 54, 432, 523};
        prefixSum(list);
        kadaneAlgo(list);
    }
}
