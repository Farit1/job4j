package ru.job4j.array;
/**
 * TurnTest
 * @author Farit Shaikhytdinov (farit84@yandex.ru)
 */
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class TurnTest {
    @Test
    /**
     * Method whenTurnArrayWithEvenAmountOfElementsThenTurnedArray - метод выполняет тестирование переворота массива с четным количеством элементов
     */
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = turner.back(input);
        int[] expect = new int[] {2, 6, 1, 4};
        assertThat(result, is(expect));
    }
    @Test
    /**
     * Method whenTurnArrayWithOddAmountOfElementsThenTurnedArray - метод выполняет тестирование переворота массива с нечетным количеством элементов
     */
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        //напишите здесь тест, проверяющий переворот массива с нечётным числом элементов, например {1, 2, 3, 4, 5}.
        Turn turner = new Turn();
        int[] input = new int[] {5, 2, 7, 1, 8};
        int[] result = turner.back(input);
        int[] expect = new int[] {8, 1, 7, 2, 5};
        assertThat(result, is(expect));
    }
}
