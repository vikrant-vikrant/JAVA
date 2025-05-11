
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

    //Print Reverse of ArrayList
    public static void reverseArr(ArrayList<Integer> num) {
        for (int i = num.size() - 1; i >= 0; i--) {
            System.out.print(num.get(i) + ", ");
        }
    }

    //Find max in ArrayList
    public static int maxArrList(ArrayList<Integer> num) {
        Integer max = Integer.MIN_VALUE;
        for (int i = 0; i < num.size(); i++) {
            // if (num.get(i) > max) {
            //     max = num.get(i);
            // }
            max = Math.max(max, num.get(i));
        }
        return max;
    }

    //swap 2 numbers
    public static void swapIdx(ArrayList<Integer> num, int idx1, int idx2) {
        int temp = num.get(idx1);
        num.set(idx1, num.get(idx2));
        num.set(idx2, temp);
    }

    //Container with most water
    public static void mostWater(ArrayList<Integer> nums) {
        int maxwater = 0;
        //brute force
        // for (int i = 0; i < nums.size(); i++) {
        //     for (int j = nums.size() - 1; j >= 0; j--) {
        //         int height = Math.min(nums.get(i), nums.get(j));
        //         maxwater = Math.max(maxwater, height * (j - i));
        //     }
        // }
        // System.out.println("Most water " + maxwater);

        //two pointer approch
        int st = 0;
        int ed = nums.size()-1;
        while(st<ed){
          maxwater = Math.max(maxwater, (ed-st)*Math.min(nums.get(st),nums.get(ed)));
          if(nums.get(st)<nums.get(ed)){
            st++;
          }else{
            ed--;
          }
        }
        System.out.println("Most water " + maxwater);
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        // height.add(3);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        mostWater(height);
        //java collection framework
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            list1.add(i);
            list2.add(i * 2);
            list3.add(i * 3);
        }
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        // System.out.println(mainList);
        // for(int i=0;i<mainList.size();i++){
        //     ArrayList<Integer> curr = mainList.get(i);
        //     for(int j=0;j<curr.size();j++){
        //         System.out.print(curr.get(j)+", ");
        //     }
        //     System.out.println();
        // }

        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();
        //Operations
        // Add Element o(1)
        // Get Element O(1)
        // Remove Element O(n)
        // Set Element at Index O(n)
        // Contains Element O(n)
        // List size (n)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        // list.remove(1);
        list.set(1, 30);
        list.set(2, 310);
        // Collections.sort(list);//ascending order
        Collections.sort(list, Collections.reverseOrder());//descending order
        // Collection.
        // System.out.println(list);
        // swapIdx(list, 3, 1);
        // swapIdx(list, 2, 3);
        // System.out.println(list);

        // reverseArr(list);
        // System.out.println();
        // System.out.println(maxArrList(list));
    }
}
