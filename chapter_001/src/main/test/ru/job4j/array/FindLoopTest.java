package ru.job4j.array;
/**
 * FindLoopTest
 * @author Farit Shaikhytdinov (farit84@yandex.ru)
 */
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {
    /**
     * Method whenArrayHas5Then0 - Метод выполняет тестирование метода FindLoop с массивом {5,10,13}.
     */
/*    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }*/
    /**
     * Method whenFind3 - Метод выполняет тестирование метода FindLoop с массивом {5, 2, 10, 2, 4}.
     * начиная с индекса 2 по 4
     */
    @Test
    public void whenFind3() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = find.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    /**
     * Method whenFind4 - Метод выполняет тестирование метода FindLoop с массивом {5, 2, 10, 2, 4}.
     * начиная с индекса 2 по 4
     */
    @Test
    public void whenFind4() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 6;
        int start = 2;
        int finish = 4;
        int result = find.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }
}