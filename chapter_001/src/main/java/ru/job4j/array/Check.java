package ru.job4j.array;
/***
 *  Check
 *  @author Farit Shaikhytdinov (farit84@yandex.ru)
 **/
public class Check {
    /**
     * Method mono - выполняет проверку что все элементы в массиве являются или true или false
     * @param data - массив, который передается в метод для проверки
     * @return result - метод возвращает true - если все элементы массива вляются или true или false, метод возвращает false, если хоть один элемент массива отличается от остальных
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 1; i <= data.length-1; i++) {
            if (data[0]!=data[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
