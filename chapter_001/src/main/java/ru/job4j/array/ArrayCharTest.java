package ru.job4j.array;
/***
 *  ArrayCharTest
 *  @author Farit Shaikhytdinov (farit84@yandex.ru)
 **/
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayCharTest {
    @Test
    /**
     * Method whenStartWithPrefixThenTrue -
     * выполняет тестирование метода startsWith,
     * который выполняет проверку массива,
     * где первые элементы массива word совпадают с элементами массива pref.
     */
    public void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(true));
    }

    @Test
    /**
     * Method  whenNotStartWithPrefixThenFalse -
     * выполняет тестирование метода startsWith,
     * который выполняет проверку массива,
     * где первые элементы массива word НЕсовпадают с элементами массива pref.
     */
    public void whenNotStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'i'};
        boolean result =ArrayChar.startsWith(word, pref);
        assertThat(result, is(false));
    }
}