package com.lzq.springcould;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: springcould
 * @description:
 * @author: liuzhenqi
 * @create: 2020-05-18 10:16
 **/
@SpringBootApplication
@EnableEurekaServer //EnableEurekaServer服务端的启动类
public class EurekaServer_7001 {
  public static void main(String[] args) {
      SpringApplication.run(EurekaServer_7001.class,args);
  }
}
