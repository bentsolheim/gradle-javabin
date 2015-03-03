package no.javabin.gradledemo.service

import groovy.util.logging.Slf4j


@Slf4j
class AddService {

    int add(int a, int b) {

        log.debug(String.format("Adding numbers %d and %d", a, b))
        a + b
    }
}
