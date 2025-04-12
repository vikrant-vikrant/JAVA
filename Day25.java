import java.util.*;

public class Day25 {

    public static boolean intOccurence(int num[]) {
        for (int i = 0; i < num.length; i++) {
            int x = num[i];
            for (int j = i + 1; j < num.length; j++) {
                if (x == num[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    //SORTING - Arrange in an order
    //Basic Algorithms (Bubble ,Selection ,Insertion ,Counting advanced Sort)
    //Bubble sort
    public static void bubbleSort(int arr[]) {
        for (int turn = 0; turn < arr.length; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArr(int num[]) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }

    //SELECTION SORT
    public static void selectionSort(int num[]) {
        for (int i = 0; i < num.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < num.length; j++) {
                if (num[minPos] > num[j]) {
                    minPos = j;
                }
            }
            int temp = num[minPos];
            num[minPos] = num[i];
            num[i] = temp;
        }
    }
    //INSERTION SORT
    public static void insertionSort(int num[]) {
        for (int i = 1; i < num.length; i++) {
            int curr = num[i];
            int prev = i - 1;
            //finding out the correct position to insert
            while (prev >= 0 && num[prev] > curr) {
                num[prev + 1] = num[prev];
                prev--;
            }
            //insertion
            num[prev + 1] = curr;
        }
    }

    //COUNTING SORT
    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        //sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String args[]) {
        int arr[] = {7, 5, 8, 3, 2, 9, 5, 7, 9, 8};
        countingSort(arr);
        printArr(arr);
        // int arr[] = {7, 5, 8, 3, 2, 9};
        //INBUILT SORT
        // Arrays.sort(arr, Collections.reverseOrder());
        // Integer arr[] = {7, 5, 8, 3, 2, 9};
        // Arrays.sort(arr, 0, 4);
        // insertionSort(arr);
        // selectionSort(arr);
        // bubbleSort(arr);
        // int num[] = {2, 3, 4, 3, 5, 2};
        // System.out.println(intOccurence(num));
    }
}
