package no.javabin.gradledemo.service;

import org.junit.Assert;
import org.junit.Test;

public class AddServiceTest {

    @Test
    public void verifyAddAddsNumbers() {

        Assert.assertEquals(9, new AddService().add(2, 7));
    }
}