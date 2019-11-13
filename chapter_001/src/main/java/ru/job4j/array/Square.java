package ru.job4j.array;

/**
 * Square
 * @author Farit Shaikhytdinov (farit84@yandex.ru)
 */

public class Square {
    /**
     * Method calculate - Метод выполняет заполнение массива через цикл элементами от 1 до bound возведенными в квадрат.
     * @param bound - Количество элементов массива
     * @return rst - Возвращает заполненный массив
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        // заполнить массив через цикл элементами от 1 до bound возведенными в квадрат
        for (int i = 1; i<=bound; i++) {
            rst[i-1] = i*i;
        }
        return rst;
    }
}
