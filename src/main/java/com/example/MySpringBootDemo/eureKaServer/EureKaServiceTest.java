package com.example.MySpringBootDemo.eureKaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EureKaServiceTest {
    public static void main(String[] args) {
                new SpringApplicationBuilder(EureKaServiceTest.class)
                             .web(true).run(args);
             }
 }

