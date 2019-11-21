package ru.job4j.array;
/**
 * MatrixCheck
 * @author Farit Shaikhytdinov (farit84@yandex.ru)
 */
public class MatrixCheck {
    /**
     * Method isWin метод, который выполняет проверку, что на поле находится выигрышная ситуация
     * т.е. проверяет, что в квадратном массиве есть строчки или столбцы заполненные только символов 'X'.
     * @param board - передает в метод матрицу
     * @return result - при обнаружении выигрышной ситуации возвращает true
     */
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int row = 0; row < board.length; row++) {
            boolean resultrow = true;
            boolean resultcell = true;
            for (int cell = 0; cell < board.length; cell++) {
                if (board[row][cell] != 'X') {
                    resultrow = false;
                }
                if (board[cell][row] != 'X') {
                    resultcell = false;
                }
            }
            if ((resultrow==true)||(resultcell==true)) {
                row = board.length;
                result = true;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[][] hasWinVertical = {
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
        };
        boolean win = isWin(hasWinVertical);
        System.out.println("A board has a winner1 : " + win);
        System.out.println();
        char[][] hasWinHor = {
                {'_', '_', '_', '_', '_'},
                {'X', 'X', 'X', 'X', ' '},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
        };
        boolean winHor = isWin(hasWinHor);
        System.out.println("A board has a winner2 : " + winHor);
        System.out.println();
        char[][] notWin = {
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', 'X', '_', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
        };
        boolean lose = isWin(notWin);
        System.out.println("A board has a winner3 : " + lose);
    }
}