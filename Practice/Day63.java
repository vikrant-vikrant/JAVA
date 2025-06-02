public class Day63{
  //bubble sort
  public static void bubbleSort(int nums[]){
    for(int i=0;i<nums.length;i++){
      for(int j=0;j<nums.length-1-i;j++){
        if(nums[j] > nums[j+1]){
          int temp = nums[j];
          nums[j] = nums[j+1];
          nums[j+1] = temp;
        }
      }
    }
  }
  //selection sort
  public static void selectionSort(int nums[]){
    for(int i=0;i<nums.length-1;i++){
        int min = i;
      for(int j=i+1;j<nums.length;j++){
        if(nums[min] > nums[j]){
          min = j;
        }
      }
      int temp = nums[min];
      nums[min] = nums[i];
      nums[i]=temp;
    }
  }
  public static void printArr(int nums[]){
    for(int i = 0;i<nums.length;i++){
      System.out.print(nums[i]+", ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
      int nums[] = {-1,2,-8,-10};
      // int nums[] = {4,2,3,5,1};
      printArr(nums);
      // bubbleSort(nums);
      selectionSort(nums);
      printArr(nums);
  }
}