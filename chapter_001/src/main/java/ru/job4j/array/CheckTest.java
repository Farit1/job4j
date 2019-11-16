package ru.job4j.array;
/**
 * CheckTest
 * @author Farit Shaikhytdinov (farit84@yandex.ru)
 */
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckTest {
    @Test
    /**
     * Method whenDataMonoByTrueThenTrue - выполняет тестирование метода check, который выполняет проверку массива, где все элементы = true
     */
    public void whenDataMonoByTrueThenTrue() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, true, true};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }
    /**
     * Method whenDataNotMonoByTrueThenFalse - выполняет тестирование метода check, который выполняет проверку массива, где один элемент оличается от остальных
     */
    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, false, true};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
}