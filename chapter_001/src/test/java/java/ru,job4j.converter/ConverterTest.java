package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.ru.job4j.converter.Converter;

public class ConverterTest {

    public static void main(String[] args) {

    }

    @Test
    public void valuta(){
        int in = 500;
        int ex = 8;
        int out = Converter.ConRu(in);
        Assert.assertEquals(ex, out);
    }

    @Test
    public void valutaOne(){
        int in = 430;
        int ex = 6;
        int out = Converter.ConEu(in);
        Assert.assertEquals(ex, out);
    }

    @Test
    public void valutaRes(){
        int in = 8;
        int ex = 480;
        int out = Converter.ReversRu(in);
        Assert.assertEquals(ex, out);
    }

    @Test
    public void valutaResOne(){
        int in = 6;
        int ex = 420;
        int out = Converter.ReversEu(in);
        Assert.assertEquals(ex, out);
    }

}
