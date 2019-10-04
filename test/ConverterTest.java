package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {
    @Test
    public void rubleToEuro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void rubleToDollar() {
        int in = 80;
        int excepted = 3;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(excepted, out);
    }


    @Test
    public void euroToRuble() {
        int in = 2;
        int excepted = 140;
        int out = Converter.euroToRuble(in);
        Assert.assertEquals(excepted, out);
    }

    @Test
    public void dollarToRuble() {
        int in = 2;
        int excepted = 120;
        int out = Converter.dollarToRuble(in);
        Assert.assertEquals(excepted, out);
    }

}
