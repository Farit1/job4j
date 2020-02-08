package ru.job4j.array;
/**
 * Turn
 * @author Farit Shaikhytdinov (farit84@yandex.ru)
 */
public class Turn {
    /**
     * Method back - метод выполняет переворот массива
     * @param array - исходный массив, передаваемый в метод back
     * @return array - возвращает перевернутый массив
     */
    public int[] back(int[] array) {
        int temp;
        for (int index = 0; index < array.length / 2; index++) {
            temp = array[index];
            array[index] = array[array.length - index - 1];
            array[array.length - index - 1] = temp;
        }
        return array;
    }
}
