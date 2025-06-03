
public class Day28 {

    //Linear search
    public static int linearSearch(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }

    //Largest in array
    public static int larInArr(int num[]) {
        int large = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (large < num[i]) {
                large = num[i];
            }
        }
        return large;
    }

    //Binary Search
    public static int binarySearch(int num[], int key) {
        int start = 0, end = num.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (num[mid] == key) {
                return mid;
            }
            if (num[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    //REVERSE IN ARRAY
    public static void reverseArr(int num[]) {
        int start = 0, last = num.length - 1;
        while (start < last) {
            int temp = num[last];
            num[last] = num[start];
            num[start] = temp;
            start++;
            last--;
        }
    }

    //pairs in array
    public static void pairInArr(int num[]) {
        for (int i = 0; i < num.length; i++) {
            for (int j = 0 + i + 1; j < num.length; j++) {
                System.out.print("(" + num[i] + "," + num[j] + ") ");
            }
            System.out.println();
        }
    }

    //subArrays 
    public static void subArr(int num[]) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(num[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        //creating an array
        //dataType arrayName[] = new dataType[size];

        //int marks[] = new int[5];
        // String fruits[] = {"apple", "mango", "orange"};
        int x[] = {2, 4, 6, 8, 10};
        subArr(x);
        // pairInArr(x);
        // int number[] = {1, 2,3, 4, 5, 9, 16, 73, 88};
        // reverseArr(number);
        // for(int i=0;i<number.length;i++){
        //     System.out.print(number[i] + " ");
        // }
        // int key = 16;
        // System.out.println(binarySearch(number, key));
        // int number[] = {1, 23, 4, 5, 9, 6, 73, 8};
        // System.out.println("Largest in array " + larInArr(number));
        // System.out.println("Index of key : " + linearSearch(number, 8));
    }
}
