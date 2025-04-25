
public class questionPractice {
    //QUESTION 1
    //Check if a number is Odd or Even

    public static boolean isEven(int n) {
        return (n & 1) == 0;
    }

    //QUESTION 2
    //check if a number is power of 2 or not
    public static boolean isPowerOf2(int n) {
        return ((n) & (n - 1)) == 0;
    }

    //QUESTION 3
    //Count Set Bits in a Number.
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
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

        n = clearIthBit(n, i);
        int BitMask = newBit << i;
        return n | BitMask;
    }

    //clear last i bits
    public static int clearIBits(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    //Clear Range of bits
    public static int clearRangeBits(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }

    //fast exponentiation
    public static int exponentiation(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    //question practicing by own
    //CHECK ODD/EVEN
    public static void isOddEven(int n) {
        if ((n & 1) == 0) {
            System.out.println(n + " is EVEN");
        } else {
            System.out.println(n + " is ODD");
        }
    }
    //GET Ith bit
    public static int Ithbit(int n, int i){
        // int bitMask = 1<<i;
        // if((n&bitMask) == 0){
        //     return 0;
        // }
        // return 1;

        return ((n&1<<i))==0?0:1;
    }
    //clear Ith bit(make it 0)
    public static int IthBitClear(int n, int i){
        return n | 1<<i;
    }

    public static int countBits(int n){
        int count = 0;
        while(n>0){
            if((n & 1) != 0){
                count++;
            }
            n = n<<1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(Ithbit(12, 1));
        System.out.println(Ithbit(12, 3));
        // isOddEven(10);
        // isOddEven(11);


        // System.out.println(exponentiation(5, 3));
        // System.out.println(countSetBits(8));
        // System.out.println(countSetBits(10));
        // System.out.println(isPowerOf2(10));
        // System.out.println(isPowerOf2(8));
        // System.out.println(clearRangeBits(10, 2, 4));
        // System.out.println(clearIBits(15, 2));
        // System.out.println(updateIthBit(10, 2, 1));
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
