package com.lzq.springcould.controller;

import com.lzq.springcould.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DtController {
    @Autowired
    private RestTemplate restTemplate;

    //Ribbon 我们这里的地址 应该是一个变量，通过服务名来访问SPRINGCOULD-DEPT
    //private static final String REST_URL="http://localhost:8001";
    private static final String REST_URL="http://SPRINGCOULD-DEPT";
    @GetMapping("/list")
    public List<Dept> list(){
         return (List<Dept>) restTemplate.getForObject(REST_URL+"/queryDept",List.class);
    }
}
