package no.javabin.gradledemo;

import org.junit.Assert;
import org.junit.Test;

public class ApplicationTest {

    @Test
    public void verifyAddAddsNumbers() {

        Assert.assertEquals(9, Application.add(2, 7));
    }
}