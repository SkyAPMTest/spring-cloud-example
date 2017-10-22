package org.skywalking.springcloud.test.projectc.service;

import java.io.IOException;
import java.util.Random;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @Autowired
    private HttpClientCaller httpClientCaller;

    @RequestMapping("/projectC/{value}")
    public String home(@PathVariable("value") String value) throws InterruptedException, IOException {
        Thread.sleep(new Random().nextInt(10) * 1000);
        httpClientCaller.call("http://www.baidu.com");
        return value + "-" + UUID.randomUUID().toString();
    }
}
