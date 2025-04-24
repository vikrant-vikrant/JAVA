
public class questionPractice {
    //QUESTION 1
    //Check if a number is Odd or Even

    public static boolean isEven(int n) {
        return (n & 1) == 0;
    }

    // Operations
    // Get ith bit(n & 1<<i)
    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    //Set ith bit
    public static int setIthBit(int n, int i) {
        int bitMast = 1 << i;
        return n | bitMast;
    }

    //Clear Ith Bit
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    //update Ith bit
    public static int updateIthBit(int n, int i, int newBit) {
        // if (newBit == 0) {
        //     return clearIthBit(n, i);
        // }else{
        //   return setIthBit(n, i);
        // }

        n=clearIthBit(n, i);
        int BitMask = newBit<<i;
        return n | BitMask;
    }

    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2, 1));
        // System.out.println(clearIthBit(10, 1));
        // System.out.println(clearIthBit(9, 2));
        // System.out.println(setIthBit(9, 2));
        // System.out.println(setIthBit(9, 1));
        // System.out.println(getIthBit(9, 0));
        // System.out.println(getIthBit(9, 1));
        // System.out.println(isEven(8));
        // System.out.println(isEven(13));
    }
}
