package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SqMaxTest {
    /**
     * Method when_fstf -
     * выполняет тестирование метода when_fstf,
     *
     */
    @Test
    public void whenfstf() {
        int expected = 30;
        int result = SqMax.max(20, 10, 30, 4);
        assertThat(result, is(expected));
    }
}

