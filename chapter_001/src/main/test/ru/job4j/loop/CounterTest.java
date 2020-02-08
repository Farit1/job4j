package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void countertest1() {
        int result = Counter.add(1, 10);
        assertThat(30, is(result));
    }
}
