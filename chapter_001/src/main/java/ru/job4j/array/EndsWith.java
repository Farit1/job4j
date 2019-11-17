package ru.job4j.array;
/***
 *  EndsWith
 *  @author Farit Shaikhytdinov (farit84@yandex.ru)
 */
public class EndsWith {
    /**
     * Method endsWith - выполняет сравнение поеледних ячеек двух массивов
     * @param word - массив слово
     * @param post - массив последовательности
     * @return result - возвращает true если последние символы word совпадают с символами post
     */
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        // проверить. что массив word имеет последние элементы одинаковые с post
        for (int i = post.length-1; i>=0; i--) {
            if (post[i]!=word[i+post.length+1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}