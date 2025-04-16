
public class Day29 {

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

    public static void printArr(int n[]) {
      for (int i = 0; i < n.length; i++) {
        System.out.print(n[i] + " ");
      }
    }

    public static void main(String args[]) {
        int num[] = {2, 15, 4, 11, 18};
        printArr(num);
        System.err.println();
        selection(num);
        printArr(num);
        // bubbleSort(num);
    }
}
