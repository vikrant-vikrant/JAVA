
public class array3 {

    public static int largestNum(int num[]) {
        int largestNum = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (largestNum < num[i]) {
                largestNum = num[i];
            }
        }
        return largestNum;
    }

    public static void reverseArr(int num[]) {
        int st = 0, ed = num.length - 1;
        while (st < ed) {
            int temp = num[ed];
            num[ed] = num[st];
            num[st] = temp;
            st++;
            ed--;
        }
    }

    public static void printArr(int num[]) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
    }

    public static int binarySearch(int num[], int key) {
        int st = 0, ed = num.length - 1;
        while (st < ed) {
            int mid = (st + ed) / 2;
            if (num[mid] == key) {
                return mid;
            }
            if (num[mid] < key) {
                st = mid + 1;
            } else {
                ed = mid - 1;
            }
        }
        return -1;
    }

    public static void pairInArr(int num[]) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                System.out.print("(" + num[i] + "," + num[j] + ")");
            }
            System.out.println();
        }
    }

    public static void subArr(int num[]) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(num[k] + ", ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void maxSubArr(int num[]) {
        int largestNum = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += num[k];
                    System.out.print(num[k] + ", ");
                }
                System.out.println("sum " + sum);
                if (sum > largestNum) {
                    largestNum = sum;
                }
            }
        }
        System.out.println("Largest sum " + largestNum);
    }

    public static void maxSubArrSumPrefix(int arr[]) {
        int currSum, maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        for (int i = 0; i < prefix.length; i++) {
            for (int j = i; j < prefix.length; j++) {
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Largest sum = " + maxSum);
    }

    public static void kadaneAlgo(int arr[]) {
        int cs = 0, ms = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            cs = cs + arr[i];
            // cs += arr[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("max sum = " + ms);
    }

    public static void main(String[] args) {
        int list[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        // int list[] = {1, -2, 6, -1, 3};
        // int list[] = {1, 54, 432, 523};
        // int list[] = {1, 12, 23, 34, 45, 54, 432, 523};
        // System.out.println(largestNum(list));
        // System.out.println(binarySearch(list, 12));
        // System.out.println(binarySearch(list, 54));
        // printArr(list);
        // reverseArr(list);
        // System.out.println();
        // printArr(list);
        maxSubArrSumPrefix(list);
        kadaneAlgo(list);
        // printArr(list);
        // pairInArr(list);
        // subArr(list);
        // maxSubArr(list);
    }
}
