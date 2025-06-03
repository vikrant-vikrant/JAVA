
public class Day63ii {

    public static boolean linearSearch(int nums[], int key) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static int larInArr(int nums[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public static int binarySearch(int nums[], int key) {
        int st = 0;
        int ed = nums.length - 1;
        while (st <= ed) {
            int mid = (ed + st) / 2;
            // int mid = st + (ed - st);
            if (nums[mid] == key) {
                return mid;
            }
            if (nums[mid] < key) {
                st = mid+1;
            } else {
                ed = mid-1;
            }
        }
        return -1;
    }

    public static void reverseArr(int nums[]){
      int st = 0,ed = nums.length-1;
      while(st<ed){
        int temp = nums[st];
        nums[st] = nums[ed];
        nums[ed] = temp;
        // int temp = nums[ed];
        // nums[ed] = nums[st];
        // nums[st] = temp;
        st++;
        ed--;
      }
    }

    public static void main(String[] args) {
        // System.out.println("Hey i am back");
        //creating an array
        //dataType arrayName[] = new dataType[size];

        //int marks[] = new int[5];
        // String fruits[] = {"apple", "mango", "orange"};
        // Scanner sc = new Scanner(System.in);
        int arr[] = {2, 3, 4, 11, 12, 1};
        System.out.println(linearSearch(arr, 3));
        System.out.println(larInArr(arr));

        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 11};
        System.out.println(binarySearch(nums, 8));
        System.out.println(binarySearch(nums, 18));
        reverseArr(nums);
        for(int i=0;i<nums.length;i++){
          System.out.print(nums[i]+" ,");
        }

        // int arr[] = new int[3];
        // arr[0] = sc.nextInt();
        // arr[1] = sc.nextInt();
        // arr[2] = sc.nextInt();
        // System.out.println("phy : "+arr[0]);
        // System.out.println("che : "+arr[1]);
        // arr[2] = 100;
        // System.out.println("mat : "+arr[2]);
        // System.out.println("Precentage = " + (arr[0] + arr[1] + arr[2])/3);
        // System.out.println(arr.length);
    }
}
