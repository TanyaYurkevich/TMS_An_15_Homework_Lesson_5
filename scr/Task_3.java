/**
 * 3. Создайте двумерный массив целых чисел. Выведите на консоль сумму
 * 	всех элементов массива.
 */

public class Task_3 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 9}, {2, 9, 2}, {3, 18, 3},{9,2}};
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.print(sum + " ");
    }
}
