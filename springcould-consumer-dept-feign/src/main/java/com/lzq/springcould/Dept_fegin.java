package com.lzq.springcould;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.lzq.springcould"})
@ComponentScan("com.lzq.springcould")
public class Dept_fegin {
    public static void main(String[] args) {
        SpringApplication.run(Dept_fegin.class, args);
    }

}

