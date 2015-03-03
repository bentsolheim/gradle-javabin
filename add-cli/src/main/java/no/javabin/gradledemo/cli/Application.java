package no.javabin.gradledemo.cli;

import no.javabin.gradledemo.service.AddService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {

    private static final Logger LOG = LoggerFactory.getLogger(Application.class);


    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        AddService addService = new AddService();

        String result = String.format("%d + %d = %d", a, b, addService.add(a, b));

        LOG.info(result);
    }
}
