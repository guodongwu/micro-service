package com.micro.feginconsumer.hystrix;

import com.micro.feginconsumer.fegin.HomeClient;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class HystrixClientFallbackFactory implements FallbackFactory<HomeClient> {
    @Override
    public HomeClient create(Throwable throwable) {
        return ()->"Feign+hystrix,提供者挂了";
    }
}
