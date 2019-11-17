package ru.job4j.array;
/***
 *  ArrayChar
 *  @author Farit Shaikhytdinov (farit84@yandex.ru)
 */
public class ArrayChar {
    /**
     * Method startsWith - выполняет сравнение ячеек двух массивов с одинаковым индексом
     * @param word - массив слово
     * @param pref - массив последовательности
     * @return result - возвращает true если первые символы word совпадают с символами pref
     */
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i<=pref.length-1; i++) {
            if (word[i]!=pref[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
