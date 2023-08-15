import static java.lang.System.out;

/**
 *4. Создайте двумерный массив. Выведите на консоль диагонали массива.
 */
public class Task_4 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 9},
                         {2, 9, 2},
                         {3, 18, 3}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
        out.println();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i + j == matrix.length - 1) {
                    out.print(matrix[i][j] + " ");
                }
            }
        }
    }
}
