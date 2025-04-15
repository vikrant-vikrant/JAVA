
public class Day28 {
    //Linear search
    public static int linearSearch(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }
    //Largest in array
    public static int larInArr(int num[]){
      int large = Integer.MIN_VALUE;
      for(int i=0;i<num.length;i++){
        if(large<num[i]){
          large = num[i];
        }
      }
      return large;
    }
    //Binary Search
    public static void binarySearch(int num[],int key){
      int start = 0;
      int end = num.length;
      while(start<=end){
        int mid = (start+end)/2;
        if(mid==key){
          return num[mid];
        }else if(mid>key){
          end--;
        }else(mid<key){
          start++;
        }

      }
    }
    public static void main(String args[]) {
        int number[] = {1, 23, 4, 5, 9, 6, 73, 8};
        System.out.println("Largest in array "+ larInArr(number));
        System.out.println("Index of key : "+linearSearch(number, 8));
    }
}
