package com.lzq.springcould;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//在服务启动后自动注册到Eureka中
@EnableEurekaClient
@SpringBootApplication
@EnableDiscoveryClient//
public class Dept_8002 {
    public static void main(String[] args) {
        SpringApplication.run(Dept_8002.class, args);
    }

}

