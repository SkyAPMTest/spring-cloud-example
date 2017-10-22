package org.skywalking.springcloud.test.projectc.service;

import java.util.UUID;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @RequestMapping("/projectC/{value}")
    public String home(@PathVariable("value") String value) throws InterruptedException {
        Thread.sleep(100);
        return value + "-" + UUID.randomUUID().toString();
    }
}
