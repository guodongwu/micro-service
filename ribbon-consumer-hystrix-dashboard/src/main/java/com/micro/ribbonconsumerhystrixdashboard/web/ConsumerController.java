package com.micro.ribbonconsumerhystrixdashboard.web;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "defaultStores")
    @GetMapping("/hello")
    public String hello(){
        return  restTemplate.getForEntity("http://eureka-provider/",String.class).getBody();
    }
    @GetMapping("/hi")
    public String hi(){
        return  restTemplate.getForEntity("http://eureka-provider/hello?hello=abcd",String.class).getBody();
    }

    public String defaultStores(){
        return "Ribbon + hystrix-dashboard,提供者挂了";
    }
}
