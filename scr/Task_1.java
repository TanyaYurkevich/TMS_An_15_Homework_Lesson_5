/**
 * 1. Шахматная доска
 * 	Создать программу для раскраски шахматной доски с помощью цикла.
 * 	Создать двумерный массив String'ов 8х8. С помощью циклов задать
 * 	элементам циклам значения B(Black) или W(White). Результат работы
 * 	программы:
 * 	W B W B W B W B
 * 	B W B W B W B W
 * 	W B W B W B W B
 * 	B W B W B W B W
 * 	W B W B W B W B
 * 	B W B W B W B W
 * 	W B W B W B W B
 * 	B W B W B W B W
 */
public class Task_1 {
    public static void main(String[] args) {
        int n = 8;
        String[][] chessBoard = new String[n][n];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int k = 0; k < chessBoard[i].length; k++) {
                if ((i % 2 == 0) && (k % 2 == 0)||(i % 2 != 0) && (k % 2 != 0)) {
                    chessBoard[i][k] = "W";
                } else {
                    chessBoard[i][k] = "B";
                }
            }
        }
        for (int i = 0; i < chessBoard.length; i++) {
            for (int k = 0; k < chessBoard[i].length; k++) {
                System.out.print(" " +chessBoard[i][k]+" ");}
            System.out.println();
        }
    }
}

