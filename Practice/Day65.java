
public class Day65 {

    public static void bubbleSort(int nums[]) {
        int swap = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                    swap++;
                }
            }
        }
        System.out.println("total swaps " + swap);
    }

    public static void printArr(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void selectionSort(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            int min = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
        }
    }

    public static void insertionSort(int nums[]) {
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int nums[] = {4, 5, 1, 3, 2};
        printArr(nums);
        // bubbleSort(nums);
        // selectionSort(nums);
        insertionSort(nums);
        printArr(nums);
    }
}
