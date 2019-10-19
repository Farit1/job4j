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
        int result2 = Max.Firstmax(4,1);
        assertThat(result2, is(4));
    }

    @Test
    public void whenSecondMax() {
        int result = Max.Secondmax(1,7);
        assertThat(result, is(7));
    }

    @Test
    public void whenSame() {
        int result = Max.same(8,8);
        assertThat(result, is(8));
    }
}
