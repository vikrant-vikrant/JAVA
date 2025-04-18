
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

    public static void main(String args[]) {
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
        int matrice[][] = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}};
        spiralMatrice(matrice);
    }
}
