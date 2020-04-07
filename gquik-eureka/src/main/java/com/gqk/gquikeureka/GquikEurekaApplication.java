package com.gqk.gquikeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GquikEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(GquikEurekaApplication.class, args);
    }

}
