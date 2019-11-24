package ru.job4j.array;
/**
 *  DefragmentTest
 *  @author Farit Shaikhytdinov (farit84@yandex.ru)
 */
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DefragmentTest {
    @Test
    /**
     * Method notFirstNull - выполняет тестирование метода Defragment, где первый элемент массива не равен null
     */
    public void notFirstNull() {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        assertThat(compressed, is(expected));
    }

    @Test
    /**
     * Method firstNull - выполняет тестирование метода Defragment, где первый элемент массива равен null
     */
    public void firstNull() {
        String[] input = {null, "I", "wanna", null, "be", null, "compressed"};
        String[] compressed = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        assertThat(compressed, is(expected));
    }

    @Test
    /**
     * Method NullNull - выполняет тестирование метода Defragment, где первые три элемента массива равны null
     */
    public void NullNull() {
        String[] input = {null, null,null, "I", "wanna", null, null, null, "be", null, "compressed", null};
        String[] compressed = Defragment.compress(input);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null, null, null,null, null, null};
        assertThat(compressed, is(expected));
    }
}
