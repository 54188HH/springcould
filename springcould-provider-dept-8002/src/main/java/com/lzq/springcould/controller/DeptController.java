package com.lzq.springcould.controller;

import com.lzq.springcloud.pojo.Dept;
import com.lzq.springcould.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService service;
    //获取一些信息  得到具体的微服务
    @Autowired
    private DiscoveryClient client;
    @GetMapping("/queryDept")
    public List<Dept> method(){
       return service.queryAll();
    }
    //注册进来的微服务   获取一些消息
    @GetMapping("/getDixcovery")
    public Object getDiscovery(){
        //获取微服务列表的清单
        List<String> services = client.getServices();
        System.out.println("---->>>>"+services);


        //得到一个具体的微服务信息，通过具体的微服务id，applicationName
        List<ServiceInstance> instances = client.getInstances("SPRINGCOULD-DEPT");
        for (ServiceInstance service:instances){
        System.out.println(
                service.getHost()+"\t"+
                service.getPort()+"\t"+
                service.getUri() +"\t"+
                service.getServiceId()
        );
        }
        return this.client;
    }
}
