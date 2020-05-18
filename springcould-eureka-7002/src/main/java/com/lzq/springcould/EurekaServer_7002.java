package com.lzq.springcould;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //EnableEurekaServer服务端的启动类
public class EurekaServer_7002 {
  public static void main(String[] args) {
      SpringApplication.run(EurekaServer_7002.class,args);
  }
}
