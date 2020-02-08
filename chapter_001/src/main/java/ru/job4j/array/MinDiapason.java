package ru.job4j.array;
/**
 * MinDiapason
 * @author Farit Shaikhytdinov (farit84@yandex.ru)
 */
public class MinDiapason {
    /**
     * Method findMin - выполняет поиск минимального значения массива в заданном диапазоне
     * @param array - массив передаваемый в метод
     * @param start - начальный индекс диапазона
     * @param finish - конечный индекс дипапзона
     * @return min - возврат минимального значения
     */
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start + 1; i < finish; i++) {
            min = (array[i] < min) ? array[i] : min;
        }
        return min;
    }
}