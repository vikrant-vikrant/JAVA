
public class practice {

    public static void spiralMatrice(int matrice[][]) {
        int startRow = 0;
        int endRow = matrice.length - 1;
        int startCollum = 0;
        int endCollum = matrice[0].length - 1;

        while (startRow <= endRow && startCollum <= endCollum) {
            //top
            for (int j = startCollum; j <= endCollum; j++) {
                System.out.print(matrice[startCollum][j] + " ");
            }
            //right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrice[i][endRow] + " ");
            }
            //bottem
            for (int j = endCollum - 1; j >= startCollum; j--) {
                System.out.print(matrice[endRow][j] + " ");
            }
            //left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                System.out.print(matrice[i][startCollum] + " ");
            }
            startRow++;
            endRow--;
            startCollum++;
            endCollum--;
        }
    }

    //2D ARRAY QUESTIONS
    public static void printNum(int arr[][], int key) {
        int output = 0;
        for (int[] arr1 : arr) {
            for (int i = 0; i < arr[0].length; i++) {
                if (arr1[i] == key) {
                    output++;
                }
            }
        }
        System.out.println("Key found : " + output + " times");
    }

    //SUM OF ARRAY ROW
    public static int rowSum(int arr[][], int row) {
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr[0].length; i++) {
                if (j == row - 1) {
                    sum += arr[j][i];
                }
            }
        }
        return sum;
    }

    //TRANSPOSE OF A MATRIX
    public static int[][] transpose(int arr[][]) {
        int nArr[][] = new int[arr[0].length][arr.length];
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr[0].length; i++) {
                nArr[i][j] = arr[j][i];
            }
        }
        return nArr;
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int matrix[][] = {{4, 7, 8}, {8, 8, 7}};
        int[][] result = transpose(matrix);
        printMatrix(result);
        System.out.println("Sum of row is : " + rowSum(matrix, 1));
        System.out.println("Sum of row is : " + rowSum(matrix, 2));
        printNum(matrix, 7);
        printNum(matrix, 8);
        // int matrice[][] = {
        //     {1, 2, 3, 4},
        //     {5, 6, 7, 8},
        //     {9, 10, 11, 12},};
        // int matrice[][] = {
        //     {1, 2, 3, 4},
        //     {5, 6, 7, 8},
        //     {9, 10, 11, 12},
        //     {13, 14, 15, 16}
        // };
        // int matrice[][] = {
        //     {1, 2, 3, 4, 5},
        //     {6, 7, 8, 9, 10},
        //     {11, 12, 13, 14, 15},
        //     {16, 17, 18, 19, 20},
        //     {21, 22, 23, 24, 25}};
        // spiralMatrice(matrice);
    }
}
