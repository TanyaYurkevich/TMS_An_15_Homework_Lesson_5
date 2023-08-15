/**
 * 2. Умножение двух матриц
 * 	Создайте два массива целых чисел размером 3х3 (две матрицы).
 * 	Напишите программу для умножения двух матриц.
 * 	Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
 * 	Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
 * 	Ожидаемый результат: 1 2 3 1 1 1 0 0 0
 */

public class Task_2 {
    public static void main(String[] args) {
        int n = 3;
        int[][] matrix1 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] matrix2 = {{1, 2, 3}, {1, 1, 1},{0, 0, 0}, {2, 1, 0}};
        int[][] mResult = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    mResult[i][j] += matrix1[i][k] * matrix2[k][j];
                }
                System.out.print(mResult[i][j] + " ");
            }

            System.out.println();
        }
    }
}
