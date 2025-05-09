
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
    public static void findPermutation(String str, String ans) {
        if (str.length() == 0) {
            System.out.print(ans + ", ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);

            String newStr = str.substring(0, i) + str.substring(i + 1);
            findPermutation(newStr, ans + curr);
        }
    }

    //N-Queens
    public static boolean nQueens(char board[][], int row) {
        if (row == board.length) {
            // printBoard(board);
            count++;
            return true;
        }
        //column loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if (nQueens(board, row + 1)) {
                    return true;
                }
                board[row][j] = 'X';
            }
        }
        return false;
    }

//is Safe
    public static boolean isSafe(char board[][], int row, int col) {
        //vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        //diagnol left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
            //diagnol right up
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    //print board
    public static void printBoard(char board[][]) {
        System.out.println("-------");
        for (char[] board1 : board) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board1[j] + " ");
            }
            System.out.println();
        }
    }

    static int count = 0;

    public static void main(String[] args) {
        //initialize 
        int n = 5;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        if (nQueens(board, 0)) {
            System.out.println("Total way to solve n Queens = " + count);
            printBoard(board);
        }else{
          System.out.println("Solutions not exist");
        }
        // String alpha = "abc";
        // findPermutation(alpha, "");
        // findSubsets(alpha, "", 0);
        // int arr[] = new int[5];
        // changeArr(arr, 0, 1);
        // System.out.println();
        // printArr(arr);
    }
}
