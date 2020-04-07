package com.gqk.gquikfeign.controller;

import com.gqk.gquikfeign.client.ServiceFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @Autowired
    private ServiceFeignClient serviceFeignClient;

    // 调用：localhost:6004/consumerService?token=1
    @GetMapping("/halloService")
    public String consumerService(){
        return serviceFeignClient.hello();

    }
}
