
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

    //Grid ways
    public static int gridWays(int i, int j, int n, int m) {
        if (i == n - 1 && j == m - 1) {
            return 1;
        } else if (i == n || j == n) {
            return 0;
        }

        int w1 = gridWays(i + 1, j, n, m);
        int w2 = gridWays(i, j + 1, n, m);
        return w1 + w2;

    }

    //Sudoku solver
    public static boolean issafe(int sudoku[][], int row, int col, int digit) {
        //col
        for (int i = 0; i <= 8; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }
        //row
        for (int j = 0; j <= 8; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }
        //grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean sudokuSolver(int sudoku[][], int row, int col) {
        if (row == 9) {
            return true;
        }

        int nextRow = row, nextCol = col + 1;
        if (col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }
        if (sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        for (int digit = 1; digit <= 9; digit++) {
            if (issafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if (sudokuSolver(sudoku, nextRow, nextCol)) {
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }

    public static void printSudoku(int sudoku[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + ", ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int sudoku[][] = {
            {0, 0, 8, 0, 0, 0, 0, 0, 0},
            {4, 9, 0, 1, 5, 7, 0, 0, 2},
            {0, 0, 3, 0, 0, 4, 1, 9, 0},
            {1, 8, 5, 0, 6, 0, 0, 2, 0},
            {0, 0, 0, 0, 2, 0, 0, 6, 0},
            {9, 6, 0, 4, 0, 5, 3, 0, 0},
            {0, 3, 0, 0, 7, 2, 0, 0, 4},
            {0, 4, 9, 0, 3, 0, 0, 5, 7},
            {8, 2, 7, 0, 0, 9, 0, 1, 3}
        };

        if (sudokuSolver(sudoku, 0, 0)) {
            System.out.println("solution exists");
            printSudoku(sudoku);
        } else {
            System.out.println("Solution doesn't exist ");
        }
        // System.out.println(gridWays(0, 0, 3, 3));
        //initialize 
        // int n = 5;
        // char board[][] = new char[n][n];
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         board[i][j] = 'X';
        //     }
        // }
        // if (nQueens(board, 0)) {
        //     System.out.println("Total way to solve n Queens = " + count);
        //     printBoard(board);
        // } else {
        //     System.out.println("Solutions not exist");
        // }
        // String alpha = "abc";
        // findPermutation(alpha, "");
        // findSubsets(alpha, "", 0);
        // int arr[] = new int[5];
        // changeArr(arr, 0, 1);
        // System.out.println();
        // printArr(arr);
    }
}
