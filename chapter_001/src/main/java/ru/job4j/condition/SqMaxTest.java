package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SqMaxTest {
    @Test
    public void when_fstf() {
        int expected = 30;
        int result = SqMax.max(20,10,30,4);
        assertThat(result, is(expected));
    }
}

