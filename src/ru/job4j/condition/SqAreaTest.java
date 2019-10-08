package ru.job4j.condition;
import org.junit.Assert;
import org.junit.Test;
public class SqAreaTest {
    @Test
    public void square(){
        int p = 5;
        int k = 3;
        double expected = 1;
        double out = SqArea.square(p,k);
        Assert.assertEquals(expected,out,0.01);
    }

}
