package ru.job4j.array;
/**
 * FindLoop
 * @author Farit Shaikhytdinov (farit84@yandex.ru)
 */
public class FindLoop {
    /**
     * Method indexOf - Метод выполняет поиск элемента в массиве.
     * @param data - массив
     * @param el - искомое значение в массиве
     * @return rst - Возвращает индекс поиска
     */
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index <= data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
