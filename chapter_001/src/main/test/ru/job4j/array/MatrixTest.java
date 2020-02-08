package ru.job4j.array;
/**
 *  MatrixTest
 * @author Farit Shaikhytdinov (farit84@yandex.ru)
 */
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixTest {
    @Test
    /**
     * Method when2on2 - метод тестирует матрицу 2х2
     */
    public void when2on2() {
        Matrix matrix = new Matrix();
        int[][] table = matrix.multiple(2);
        int[][] expect = {
                {1, 2},
                {2, 4}
        };
        assertThat(table, is(expect));
    }
    @Test
    /**
     * Method when4on4 - метод тестирует матрицу 4х4
     */
    public void when4on4() {
        Matrix matrix = new Matrix();
        int[][] table = matrix.multiple(4);
        int[][] expect = {
                {1, 2, 3, 4},
                {2, 4, 6, 8},
                {3, 6, 9, 12},
                {4, 8, 12, 16}
        };
        assertThat(table, is(expect));
    }
}