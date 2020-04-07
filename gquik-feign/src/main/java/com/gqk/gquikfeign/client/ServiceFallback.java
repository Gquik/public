package com.gqk.gquikfeign.client;

import org.springframework.stereotype.Component;

@Component
public class ServiceFallback implements ServiceFeignClient{
    @Override
    public String hello() {
        return "服务调用失败";
    }
}
