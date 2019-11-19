package ru.job4j.array;
/**
 * FindLoopTest
 * @author Farit Shaikhytdinov (farit84@yandex.ru)
 */
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    /**
     * Method whenSort5 - Метод выполняет тестирования метода сортировки выборкой массива из 5 элементов.
     */
    @Test
    public void whenSort5() {
        int[] input = new int[]{3, 4, 1, 2, 5};
        int result[] = SortSelected.sort(input);
        int[] expect = new int[]{1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }
    /**
     * Method whenSort5 - Метод выполняет тестирования метода сортировки выборкой массива из 3 элементов.
     */
    @Test
    public void whenSort3() {
        int[] input = new int[]{8, 1, 3};
        int result[] = SortSelected.sort(input);
        int[] expect = new int[]{1, 3, 8};
        assertThat(result, is(expect));
    }
}