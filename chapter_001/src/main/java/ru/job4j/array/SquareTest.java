package ru.job4j.array;
/**
 * SquareTest
 * @author Farit Shaikhytdinov (farit84@yandex.ru)
 */

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {
    /**
     * Method whenBound3Then149 - Метод выполняет тестирование метода Square.
     */
    @Test
    public void whenBound3Then149() {
        int bound = 3;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] except = new int[] {1,4,9};
        assertThat(rst, is(except));
    }
}
