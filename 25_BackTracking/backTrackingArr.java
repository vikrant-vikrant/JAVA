
public class backTrackingArr {

    public static void changeArr(int arr[], int i, int value) {
        if (i == arr.length) {
            printArr(arr);
            return;
        }
        arr[i] = value;
        changeArr(arr, i + 1, value + 1);
        arr[i] = arr[i] - 2;
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ,");
        }
    }

    //find subasets
    public static void findSubsets(String str, String ans, int i) {
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.print("null");
            } else {
                System.out.print(ans + ", ");
            }
            return;
        }
        //yes choice
        findSubsets(str, ans + str.charAt(i), i + 1);
        //no choice
        findSubsets(str, ans, i + 1);
    }
    //find permutations
    public static void findPermutation(String str, String ans){
        if(str.length() == 0){
            System.out.print(ans + ", ");
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);

            String newStr = str.substring(0,i) + str.substring(i+1);
            findPermutation(newStr, ans+curr);
        }
    }
    public static void main(String[] args) {
        String alpha = "abc";
        findPermutation(alpha, "");
        // findSubsets(alpha, "", 0);
        // int arr[] = new int[5];
        // changeArr(arr, 0, 1);
        // System.out.println();
        // printArr(arr);
    }
}
