package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1,2);
        assertThat(result, is(2));
    }
    @Test
    public void whenFirstMax() {
        int result = Max.max(6,1);
        assertThat(result, is(6));
    }
    @Test
    public void whenSecondMax() {
        int result = Max.max(2,5);
        assertThat(result, is(5));
    }
    @Test
    public void whenSame() {
        int result = Max.max(3,3);
        assertThat(result, is(3));
    }
}