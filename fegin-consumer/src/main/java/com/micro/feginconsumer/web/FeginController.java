package com.micro.feginconsumer.web;


import com.micro.feginconsumer.fegin.HomeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeginController {
    @Autowired
    private HomeClient homeClient;
    @GetMapping("/hello")
    public  String hello(){
        return homeClient.consumer();
    }
}
