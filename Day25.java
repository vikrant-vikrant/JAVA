
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

    public static void main(String args[]) {
        int arr[] = {7, 5, 8, 3, 2, 9};
        bubbleSort(arr);
        printArr(arr);
        // int num[] = {2, 3, 4, 3, 5, 2};
        // System.out.println(intOccurence(num));
    }
}
