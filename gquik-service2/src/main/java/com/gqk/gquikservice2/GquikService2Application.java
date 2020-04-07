package com.gqk.gquikservice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@EnableDiscoveryClient
@RefreshScope   //开启配置更新功能
public class GquikService2Application {

    public static void main(String[] args) {
        SpringApplication.run(GquikService2Application.class, args);
    }

}
