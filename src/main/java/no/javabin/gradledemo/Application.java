package no.javabin.gradledemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {

    private static final Logger LOG = LoggerFactory.getLogger(Application.class);


    public static int add(int a, int b) {

        return a + b;
    }


    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        String result = String.format("%d + %d = %d", a, b, add(a, b));

        LOG.info(result);
    }
}
