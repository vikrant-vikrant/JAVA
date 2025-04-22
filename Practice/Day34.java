
public class Day34 {
    public static void bubble(int arr[]) {
        int swap = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
        }
        System.out.println("Total swap " + swap);
    }
    public static void selection(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    //transposed matrix
    public static int[][] transposed(int arr[][]){
        int kk[][] = new int[arr[0].length][arr.length];
        for (int j=0;j<arr.length;j++) {
            for (int i = 0; i<arr[0].length; i++) {
                kk[i][j] = arr[j][i];
            }
        }
        return kk;
    }
    public static void print(int ar[][]){
        for (int[] ar1 : ar) {
            for (int j = 0; j<ar[0].length; j++) {
                System.out.print(ar1[j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][]  = {{2,4,6},{1,3,5}};
        print(transposed(arr));
        // int[] arr = {5, 4, 1, 3, 2};
        // int[] arr = {5, 1, 4, 2, 8};
        // int arr[] = {2,1,3,5,4,6};
        // bubble(arr);
        // Arrays.sort(arr,0,3);
        // selection(arr);
        // printArr(arr);
    }
}
