
import java.util.ArrayList;

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

    public static void main(String[] args) {
        //java collection framework
        ArrayList<Integer> list = new ArrayList<>();
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
        System.out.println(list);
        // swapIdx(list, 3, 1);
        // swapIdx(list, 2, 3);
        // System.out.println(list);
        
        // reverseArr(list);
        // System.out.println();
        // System.out.println(maxArrList(list));
    }
}
