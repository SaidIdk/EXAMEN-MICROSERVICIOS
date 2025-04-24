package com.rttm.rttmregistryservidor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RttmRegistryServidorApplication {

    public static void main(String[] args) {
        SpringApplication.run(RttmRegistryServidorApplication.class, args);
    }

}
