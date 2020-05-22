package com.lzq.springcould.controller;

import com.lzq.springcould.pojo.Dept;
import com.lzq.springcould.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService service;
  // 获取一些信息  得到具体的微服务

  @GetMapping("/queryDept")
  @HystrixCommand(fallbackMethod = "sjh")
  public List<Dept> method() {

            throw new RuntimeException("查询的信息未注册");
  }
    public List<Dept> sjh(){
        System.out.println("熔断方法");
        Dept dept = new Dept();
        dept.setDbSource("this id no mysql");
        dept.setDeptId(1);
        dept.setDeptName("查询信息发生异常！！！！");
        List<Dept> lsit = new ArrayList<>();
        lsit.add(dept);
        return lsit;
    }
}
