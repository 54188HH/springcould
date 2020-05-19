package com.lzq.springcould;

import com.lzq.myrule.BeaseRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;


@SpringBootApplication
@EnableEurekaClient
//在微服务启动的时候加载自己定义的Ribbon  负载均衡方法
@RibbonClient(name = "SPRINGCOULD-DEPT",configuration = BeaseRule.class)
public class Dept_8080 {
    public static void main(String[] args) {
        SpringApplication.run(Dept_8080.class, args);
    }

}

