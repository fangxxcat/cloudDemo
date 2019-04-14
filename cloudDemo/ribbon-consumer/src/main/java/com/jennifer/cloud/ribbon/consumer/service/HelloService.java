package com.jennifer.cloud.ribbon.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate; // 注入restTemplate对象

    public String sayHello() {
        // 通过rest调用，调用provider服务
        return restTemplate.getForObject("http://ribbon-provider/hello?name=provider", String.class);
    }
}
