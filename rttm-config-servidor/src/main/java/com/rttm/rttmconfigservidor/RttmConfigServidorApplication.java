package com.rttm.rttmconfigservidor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class RttmConfigServidorApplication {

    public static void main(String[] args) {
        SpringApplication.run(RttmConfigServidorApplication.class, args);
    }

}
