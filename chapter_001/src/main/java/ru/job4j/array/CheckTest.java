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
     * Method whenDataMonoByTrueThenTrue -
     * выполняет тестирование метода check,
     * который выполняет проверку массива,
     * где все элементы = true.
     */
    public void whenDataMonoByTrueThenTrue() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, true, true};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }
    /**
     * Method whenDataNotMonoByTrueThenFalse -
     * выполняет тестирование метода check,
     * который выполняет проверку массива,
     * где один элемент оличается от остальных.
     */
    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, false, true};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
    @Test
    /**
     * Method whenArrayDataEvenElementsMonoByFalseThenTrue -
     * выполняет тестирование метода check,
     * который выполняет проверку массива с четным количеством элементов,
     * где все элементы = false.
     */
    public void whenArrayDataEvenElementsMonoByFalseThenTrue() {
        Check check = new Check();
        boolean[] input = new boolean[] {false, false, false, false, false, false};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }
    @Test
    /**
     * Method whenArrayDataEvenElementsMonoByTrueThenTrue -
     * выполняет тестирование метода check,
     * который выполняет проверку массива c четным количеством элементов,
     * где один элементы = false,  остальные true.
     */
    public void whenArrayDataEvenElementsNotMonoByTrueThenFalse() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, true, true, true, false, true};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
    @Test
    /**
     * Method whenArrayDataOddElementsMonoByFalseThenTrue -
     * выполняет тестирование метода check, который выполняет проверку массива,
     * c нечетным количеством элементов,
     * где все элементы = false.
     */
    public void whenArrayDataOddElementsMonoByFalseThenTrue() {
        Check check = new Check();
        boolean[] input = new boolean[] {false, false, false, false, false};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }
}