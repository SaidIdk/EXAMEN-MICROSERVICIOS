package com.rttm.rttmcursoservicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RttmCursoServicioApplication {

    public static void main(String[] args) {
        SpringApplication.run(RttmCursoServicioApplication.class, args);
    }

}
