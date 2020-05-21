package com.lzq.springcould;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.health.ConditionalOnEnabledHealthIndicator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//在服务启动后自动注册到Eureka中
@EnableEurekaClient
@SpringBootApplication
@EnableDiscoveryClient//
@EnableCircuitBreaker
public class Dept_hystrix_8003 {
    public static void main(String[] args) {
        SpringApplication.run(Dept_hystrix_8003.class, args);
    }

}

