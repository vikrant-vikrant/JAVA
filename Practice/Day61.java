


public class Day61 {

    ///------ARRAYS------///
    //Linear search
    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    //Largest in arr
    public static int largestNum(int arr[]) {
        int output = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > output) {
                output = arr[i];
            }
        }
        return output;
    }

    //Binary search
    public static int binarySearch(int arr[], int key) {
        int st = 0, ed = arr.length - 1;
        while (st <= ed) {
            int mid = st + ed;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                ed = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return -1;
    }

    //ascending order
    public static boolean isAscending(int arr[]) {
        boolean output = false;
        for (int i = 0; i < arr.length - 1; i++) {
            output = arr[i] <= arr[i + 1];
            if (!output) {
                break;
            }
        }
        return output;
    }

    //disending order
    public static boolean isDisending(int arr[]) {
        boolean output = false;
        for (int i = 0; i < arr.length - 1; i++) {
            output = arr[i] >= arr[i + 1];
            if (!output) {
                break;
            }
        }
        return output;
    }
    public static boolean isMonotonic(int nums[]){
      if(nums.length == 1){
        return true;
      }
      return isAscending(nums) || isDisending(nums);
    }
    public static void main(String args[]) {
      //monotonic
      // int arr[] = {100,90,80,79,48,39,23,12,11};
      // System.out.println(isMonotonic(arr));
      

      //desending order
      // int arr[] = {100,90,80,79,50,48,39,23,12,11};
      // int arr[] = {-20,-19,-17,-14};
      // System.out.println(isDisending(arr));


        //ascending order
        // int arr[] = {20,19,17,14};
        // int arr[] = {-2,-3,-4,-23,-34,-54};
        // System.out.println(isAscending(arr));


        //Binary search
        // int arr[] = {54, 34, 23, 12, 4, 3, 3, 2, 1};
        // System.out.println(binarySearch(arr, 4));


        //Largest in arr
        // int arr[] = {-2,-3,-23,-4,-12,-23,-34,-54};
        // System.out.println(largestNum(arr));


        //Linear search
        // System.out.println(linearSearch(arr, 8));
        // System.out.println(linearSearch(arr, 12));
    }
}
