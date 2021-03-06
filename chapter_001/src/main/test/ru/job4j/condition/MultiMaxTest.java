package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenFirstMax() {
        MultiMax check = new MultiMax();
        int result = check.max(5, 4, 2); // Тестиирование метода, когда максимальное в переменной first
        assertThat(result, is(5));
    }

    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2); // Тестиирование метода, когда максимальное в переменной second
        assertThat(result, is(4));
    }
    @Test
    public void whenThridMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 9); // Тестиирование метода, когда максимальное в переменной thrid
        assertThat(result, is(9));
    }
}
