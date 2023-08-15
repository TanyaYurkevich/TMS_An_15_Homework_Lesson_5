import java.util.Arrays;

/**
 *5. Создайте двумерный массив целых чисел. Отсортируйте элементы в
 * 	строках двумерного массива по возрастанию.
 */
public class Task_5 {
    public static void main(String[] args) {
        int[][] sortMat = {{5, 8, 11}, {2, 18, 6}, {28, 52, 1}};
        for (int i = 0; i < sortMat.length; i++) {
            Arrays.sort(sortMat[i]);
        }
        System.out.println(Arrays.deepToString(sortMat));

    }
}
