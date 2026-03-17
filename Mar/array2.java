
public class array2 {

    // public static void printArr(int arr[]) {
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.println(arr[i]);
    //     }
    // }
    public static void add1(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 1;
            System.out.println(arr[i]);
        }
    }

    public static int findKey(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int largestNum(int arr[]) {
        int biggestNum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (biggestNum < arr[i]) {
                biggestNum = arr[i];
            }
        }
        return biggestNum;
    }

    public static int smallestNum(int arr[]) {
        int smallestNum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (smallestNum > arr[i]) {
                smallestNum = arr[i];
            }
        }
        return smallestNum;
    }

    public static int binarySearch(int arr[], int key) {
        int st = 0, ed = arr.length - 1;
        while (st <= ed) {
            int mid = (st + ed) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                st = mid + 1;
            } else {
                ed = mid - 1;
            }
        }
        return -1;
    }

    public static void reverseArr(int arr[]) {
        int st = 0, ed = arr.length - 1;
        while (st < ed) {
            int temp = arr[ed];
            arr[ed] = arr[st];
            arr[st] = temp;
            st++;
            ed--;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void pairInArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
            }
            System.out.println();
        }
    }

    public static void subarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0 + i; j < arr.length; j++) {
                for (int k = i; k <=j; k++) {
                    System.out.print("(" + arr[j] + "," + arr[k] + ") ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String args[]) {

        // int marks[] = new int[5];
        // marks[0] = 5;
        // marks[1] = 10;
        // marks[2] = 15;
        // marks[3] = 20;
        // marks[4] = 25;
        // System.out.println(marks[1]);
        // System.out.println(" ");
        // System.out.println(marks[3]);
        // System.out.println(marks.length);
        // printArr(marks);
        // add1(marks);
        // int num[] = {1, 2, -120, -1, 11, 12, 2, 14, 13, 22, 21, 25};
        // int key = 12;
        // System.out.println(findKey(num, key));
        // System.out.println(findKey(num, 100));
        // System.out.println(largestNum(num));
        // System.out.println(smallestNum(num));
        int list[] = {2, 20, 22, 24, 45};
        // int list[] = {2, 4, 6, 8, 10, 12, 20, 22, 24, 45};
        // int key = 24;
        // System.out.println(binarySearch(list, key));
        // System.out.println(list.length);
        // printArr(list);
        // reverseArr(list);
        // System.out.println("");
        // printArr(list);
        // pairInArr(list);
        subarr(list);
    }
}
