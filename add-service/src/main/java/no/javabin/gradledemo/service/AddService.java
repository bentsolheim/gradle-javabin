package no.javabin.gradledemo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AddService {

    private static final Logger LOG = LoggerFactory.getLogger(AddService.class);


    public int add(int a, int b) {

        LOG.debug(String.format("Adding numbers %d and %d", a, b));
        return a + b;
    }
}
