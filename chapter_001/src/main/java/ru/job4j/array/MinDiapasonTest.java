package ru.job4j.array;
/**
 * MinDiapason
 * @author Farit Shaikhytdinov (farit84@yandex.ru)
 */
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
public class MinDiapasonTest {
    @Test
    /**
     * Method whenFirstMin - Метод выполняет тестирование метода findMin,
     * где минимальное значение хранится в первом элементе = 1,
     * в диапазоне от 1 по 3
     */
    public void whenFirstMin() {
        assertThat(MinDiapason.findMin(new int[] {-1, 0, 5, 10},1, 3),is(0));
    }
    /**
     * Method whenLastMin - Метод выполняет тестирование метода findMin,
     * где минимальное значение хранится в элементе = 3,
     * в диапазоне от 1 по 3
     */
    @Test
    public void whenLastMin() {
        assertThat(MinDiapason.findMin(new int[] {10, 5, 3, 1},1, 3),is(3));
    }

    /**
     * Method whenMiddleMin - Метод выполняет тестирование метода findMin,
     * где минимальное значение хранится в элементе = 1,
     * в диапазоне от 0 по 2
     */
    @Test
    public void whenMiddleMin() {
        assertThat(MinDiapason.findMin(new int[] {10, 2, 5, 1},0, 2),is(2));
    }
}