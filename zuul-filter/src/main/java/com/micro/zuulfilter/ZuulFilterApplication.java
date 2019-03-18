package com.micro.zuulfilter;

import com.micro.zuulfilter.filter.PasswordFilter;
import com.micro.zuulfilter.filter.TokenFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
public class ZuulFilterApplication {


    @Bean
    public TokenFilter tokenFilter(){
        return new TokenFilter();
    }
    public PasswordFilter passwordFilter(){
        return new PasswordFilter();
    }
    public static void main(String[] args) {
        SpringApplication.run(ZuulFilterApplication.class, args);
    }

}
