public class Day66 {

  public static void bubbleSort(int nums[]){
    for(int i=0;i<nums.length;i++){
      for(int j=0;j<nums.length-1-i;j++){
        if(nums[j] > nums[j+1]){
          int temp = nums[j+1];
          nums[j+1] = nums[j];
          nums[j] = temp;
        }
      }
    }
  }
  public static void printArr(int nums[]){
    for(int i=0;i<nums.length;i++){
      System.out.print(nums[i] + " ");
    }
    System.out.println();
  }
  public static void selectionSort(int nums[]){
    for(int i=0;i<nums.length;i++){
      int sm = i;
      for(int j=i+1;j<nums.length;j++){
        if(nums[sm] > nums[j]){
          sm = j;
        }
      }
      int temp = nums[i];
      nums[i] = nums[sm];
      nums[sm] = temp;
    }
  }

  public static void insertionSort(int nums[]){
    for(int i=1;i<nums.length;i++){
        // System.out.println("for i = " + i);

      int curr = nums[i];
      int j = i-1;
      // System.out.println("curr = " + curr);
      // System.out.println("j = " + j);
      // System.out.println("in while loop");
      while(j>=0 && nums[j]>curr){
        // System.out.println("for j = " + j);
        nums[j+1] = nums[j];
        // System.out.println("j+1 = " +  nums[j+1]);
        j--;
      }
      nums[j+1] = curr;
      // System.out.println("j+1 after while = " +  nums[j+1]);
      // printArr(nums);

    }
  }

  public static void countingSort(int nums[]){
    int largest = Integer.MIN_VALUE;
    for(int i=0;i<nums.length;i++){
      largest = Math.max(largest, nums[i]);
    }
    int count[] = new int[largest+1];
    for(int i=0;i<nums.length;i++){
      count[nums[i]]++;
    }
    int j=0;
    for(int i=0;i<count.length;i++){
      while(count[i] > 0){
        nums[j] = i;
        j++;
        count[i]--;
      }
    }
  }
  public static void main(String []args){
    int nums[] = {1,2,3,4,1,1,2,2,3,3,3,4,4,5};
    // int nums[] = {9,8,1,4,3,2};
    printArr(nums);
    // bubbleSort(nums);
    // selectionSort(nums);
    // insertionSort(nums);
    countingSort(nums);
    printArr(nums);
  }
}