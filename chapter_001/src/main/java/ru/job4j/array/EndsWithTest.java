package ru.job4j.array;
/***
 *  EndsWithTest
 *  @author Farit Shaikhytdinov (farit84@yandex.ru)
 ***/
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class EndsWithTest {
    @Test
    /**
     * Method whenStartWithPrefixThenTrue -
     * выполняет тестирование метода endsWith,
     * который выполняет проверку массива,
     * где последние элементы массива word совпадают с элементами массива post.
     */
    public void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(true));
    }
    @Test
    /**
     * Method whenNotStartWithPrefixThenFalse -
     * выполняет тестирование метода endsWith,
     * который выполняет проверку массива,
     * где последние элементы массива word НЕсовпадают с элементами массива post.
     */
    public void whenNotStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'a'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(false));
    }
    @Test
    /**
     * Method whenNotStartWithPrefixpostLongThenFalse -
     * выполняет тестирование метода endsWith,
     * который выполняет проверку массива,
     * где последние элементы массива word НЕсовпадают с элементами массива post.
     */
    public void whenNotStartWithPrefixpostLongThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'H','H', 'e', 'l', 'l', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(false));
    }

}