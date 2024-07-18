package com.limo.demo.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication(scanBasePackages = {"com.limo.demo.feign"})
@EnableAsync
@EnableFeignClients
public class WasteFeignServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WasteFeignServiceApplication.class, args);
    }

}
