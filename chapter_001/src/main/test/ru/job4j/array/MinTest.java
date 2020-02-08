package ru.job4j.array;
/**
 * MinTest
 * @author Farit Shaikhytdinov (farit84@yandex.ru)
 */
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MinTest {
    /**
     * Method whenFirstMin - Метод выполняет тестирование метода findMin,
     * где минимальное значение хранится в нулевом элементе.
     */
    @Test
    public void whenFirstMin() {
        assertThat(Min.findMin(new int[] {0, 5, 10}), is(0));
    }
    /**
     * Method whenLastMin - Метод выполняет тестирование метода findMin,
     * где минимальное значение хранится в последнем элементе.
     */
    @Test
    public void whenLastMin() {
        assertThat(Min.findMin(new int[] {10, 5, 3}), is(3));
    }
    /**
     * Method whenMiddleMin - Метод выполняет тестирование метода findMin.
     * где максимальное значение хранится в среднем элементе.
     */
    @Test
    public void whenMiddleMin() {
        assertThat(Min.findMin(new int[] {10, 2, 5}), is(2));
    }
}