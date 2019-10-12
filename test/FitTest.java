package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {
       @Test
       // test
       public void manWeight() {
           double in = 110;
           double expected = 11.5;
           double out = Fit.manWeight(in);
           Assert.assertEquals(expected, out, 0.01);
        }
        @Test
        public void womanWeight() {
            double in = 110;
            double expected = 0;
            double out = Fit.womanWeight(in);
            Assert.assertEquals(expected, out, 0.01);
        }


}
