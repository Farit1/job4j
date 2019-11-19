package ru.job4j.array;
/**
 * Matrix
 * @author Farit Shaikhytdinov (farit84@yandex.ru)
 */
public class Matrix {
    /**
     * Method multiple - Метод заполняет матрицу таблицей умножения
     * @param size - размер матрицы
     * @return table - возващает заполненную матрицу - таблицу умножения
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i+1) * (j+1);
            }
        }
        return table;
    }
}