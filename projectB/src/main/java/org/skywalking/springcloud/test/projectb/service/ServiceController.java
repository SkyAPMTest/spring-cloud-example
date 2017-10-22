package org.skywalking.springcloud.test.projectb.service;

import java.util.UUID;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @RequestMapping("/projectB/{value}")
    public String home(@PathVariable("value") String value) throws InterruptedException {
        Thread.sleep(100);
        return value + "-" + UUID.randomUUID().toString();
    }
}
