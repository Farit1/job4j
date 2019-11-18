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
     * @param start - индекс с которого начинаем поиск
     * @param finish - индекс которым заканчиваем поиск
     * @return rst - Возвращает индекс поиска
     */
    public int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = start; index <= finish; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
