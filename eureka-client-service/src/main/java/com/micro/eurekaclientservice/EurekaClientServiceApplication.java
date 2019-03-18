package com.micro.eurekaclientservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@RestController
public class EurekaClientServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientServiceApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    @GetMapping("/")
    public String home(){
        return "Hello word,port:"+port;
    }

}
