package com.lzq.springcould.controller;

import com.lzq.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DtController {
    @Autowired
    private RestTemplate restTemplate;

    private static final String REST_URL="http://localhost:8001";
    @GetMapping("/list")
    public List<Dept> list(){
        return (List<Dept>) restTemplate.getForObject(REST_URL+"/queryDept",List.class);
    }
}
