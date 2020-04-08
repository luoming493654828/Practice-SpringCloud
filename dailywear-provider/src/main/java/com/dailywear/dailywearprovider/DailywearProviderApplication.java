package com.dailywear.dailywearprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DailywearProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DailywearProviderApplication.class, args);
    }

}
