package com.micro.eurekaclientapi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@EnableEurekaClient
@SpringBootApplication
@RestController
public class EurekaClientApiApplication {

    @Value("${server.port}")
    String port;

    @GetMapping("/")
    public String home(){
        return "Hello word,port:"+port;
    }
    @GetMapping("/hello")
    public String hello(String hello){
        return "wow!,hello:"+hello;
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApiApplication.class, args);
    }

}
