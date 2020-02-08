package ru.job4j.array;
/**
 * MatrixCheckTest
 * @author Farit Shaikhytdinov (farit84@yandex.ru)
 */

import org.junit.Ignore;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@Ignore
public class MatrixCheckTest {
    @Test
    /**
     * Метод  whenDataMonoByTrueThenTrue - выполняет тестирование метода isWin
     * В квадратной матрице содержится столбец = 'X'
     */
    public void whenDataMonoByTrueThenTrue() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result, is(true));
    }

    @Test
    /**
     * Метод  whenDataMonoByTrueThenTrue2 - выполняет тестирование метода isWin
     * В квадратной матрице содержится столбец и строка = 'X'
     */
    public void whenDataMonoByTrueThenTrue2() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {'X', 'X', 'X', 'X', 'X'},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result, is(true));
    }

    @Test
    /**
     * Метод  whenDataNotMonoByTrueThenFalse - выполняет тестирование метода isWin
     * В квадратной матрице содержится отсутствует столбец и строка, где все элементы = 'X'
     */
    public void whenDataNotMonoByTrueThenFalse() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result, is(false));
    }
}