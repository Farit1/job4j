package ru.job4j.array;
/**
 * SortSelected
 * @author Farit Shaikhytdinov (farit84@yandex.ru)
 */
public class SortSelected {
    /**
     * Method sort - выполняет сортировку массива выборкой
     * @param data - параметр с не сортированным массивом
     * @return data - отсортированный массив
     */
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length);
            FindLoop find = new FindLoop();
            int index = find.indexOf(data, min, 0, data.length);
            data[index] = data[i];
            data[i] = min;
        }
        return data;
    }
}
