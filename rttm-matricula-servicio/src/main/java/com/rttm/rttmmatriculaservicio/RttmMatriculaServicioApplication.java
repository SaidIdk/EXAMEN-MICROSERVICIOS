package com.rttm.rttmmatriculaservicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RttmMatriculaServicioApplication {

    public static void main(String[] args) {
        SpringApplication.run(RttmMatriculaServicioApplication.class, args);
    }

}
