
public class Matrices {

    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Found at cell " + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Not found");
        return false;
    }

    public static void largeSmall(int matrix[][]) {
        int large = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > large) {
                    large = matrix[i][j];
                }
                if (matrix[i][j] < small) {
                    small = matrix[i][j];
                }
            }
        }
        System.out.println("Largest " + large);
        System.out.println("small " + small);
    }

    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int startCollum = 0;
        int endRow = matrix.length - 1;
        int endCollum = matrix.length - 1;

        while(startRow <= endRow && startCollum <=endCollum){
          //top
          for(int j=startCollum;j<=endCollum;j++){
            System.out.print(matrix[startCollum][j]+" ");
          }
          //right
          for(int i=startRow+1;i<=endRow;i++){
            System.out.print(matrix[i][endCollum]+" ");
          }
          //bottem
          for(int j=endCollum- 1;j>=startCollum;j--){
            if(startRow == endRow){
              break;
            }
            System.out.print(matrix[endRow][j]+" ");
          }
        //left
        for(int i=endRow- 1;i>=startRow+1;i--){
          if(startCollum == endCollum){
            break;
          }
            System.out.print(matrix[i][startCollum]+" ");
          }
        startCollum++;
        startRow++;
        endCollum--;
        endRow--;
        }
        System.out.println();
    }
    public static void diagonalSum(int matrix[][]){
      int sum = 0;
      for(int j=0;j<matrix.length;j++){
        
      }
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        printSpiral(matrix);
        // int matrix[][] = new int[3][3];
        // int n = 3, m = 3;
        // Scanner sc = new Scanner(System.in);
        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[0].length; j++) {
        //         matrix[i][j] = sc.nextInt();
        //     }
        // }

        // int matrix[][] = {
        //     {1, 2, 3},
        //     {4, 5, 6},
        //     {7, 8, 9}
        // };

        //output
        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[0].length; j++) {
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        // largeSmall(matrix);
        // search(matrix, 5);
        // search(matrix, 9);
        // search(matrix, 21);
    }
}
