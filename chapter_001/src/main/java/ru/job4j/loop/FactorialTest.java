package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty(){
        //напишите здесь тест, проверяющий, что факториал для числа 5 равен 120.
        int result1 = Factorial.calc(5);
        assertThat(120,is(result1));
    }
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        //напишите здесь тест, проверяющий, что факториал для числа 0 равен 1.
        int result2 = Factorial.calc(0);
        assertThat(1,is(result2));
    }
}
