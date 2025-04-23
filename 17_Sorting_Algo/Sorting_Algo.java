// import java.util.Arrays;
// import java.util.Collections;

public class Sorting_Algo {

    //SORTING -> aranging of array in incriging or decriging order
    //Basic algo : Bubble sort, Selection sort, Insertion sort, Counting sort
    //BUBBLE SORT
    public static void bubbleSort(int n[]) {
        for (int i = 0; i < n.length - 1; i++) {
            for (int j = 0; j < n.length - 1 - i; j++) {
                if (n[j] > n[j + 1]) {
                    int temp = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = temp;
                }
            }
        }
    }

    //SELECTION SORT
    public static void selection(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            //swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    //INSERTION SORT
    public static void Insertion(int n[]) {
        for (int i = 1; i < n.length; i++) {
            int curr = n[i];
            int prev = i - 1;
            //finding out the correct postion
            while (prev >= 0 && n[prev] > curr) {
                n[prev + 1] = n[prev];
                prev--;
            }
            //insertion 
            n[prev + 1] = curr;
        }
    }

    public static void printArr(int n[]) {
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
    }

    // public static void printArr(Integer n[]) {
    //     for (int i = 0; i < n.length; i++) {
    //         System.out.print(n[i] + " ");
    //     }
    // }
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
        int n[] = {1, 2, 3, 2, 3, 1, 1, 4, 5, 5, 4, 3};
        countingSort(n);
        printArr(n);
        // int num[] = {2, 15, 4, 11, 18};
        // printArr(num);
        //INBUILT SORT

        // Integer num[] = {2, 15, 4, 11, 18};
        // Arrays.sort(num);
        // Arrays.sort(num,0,3);
        // Arrays.sort(num,Collections.reverseOrder());
        // Arrays.sort(num, 0, 3, Collections.reverseOrder());
        // printArr(num);
        // Insertion(num);
        // printArr(num);
        // selection(num);
        // bubbleSort(num);
    }
}
