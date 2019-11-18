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
        int j = post.length-1;
        if (post.length<word.length) {
            for (int i = word.length-1; (i >= 0) & (j > 0); i--) {
                if (word[i]!=post[j]) {
                    result = false;
                    break;
                }
                j--;
            }
        }
        else {
            result = false;
        }
        return result;
    }
}