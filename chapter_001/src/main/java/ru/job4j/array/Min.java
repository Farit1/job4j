package ru.job4j.array;
/**
 * Min
 * @author Farit Shaikhytdinov (farit84@yandex.ru)
 */
public class Min {
    /**
     * Method findMin выполняет поиск минимального значения в массиве
     * @param array - массив передаваемый в метод для поиска минимального значения
     * @return min - возвращает минимальное значение
     */
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 1; index < array.length; index++) {
            // проверить, что эталон больше, чем элемент. записать в эталон элемент массива.
            min = (array[index]<min)?array[index]:min;
        }
        return min;
    }
}
