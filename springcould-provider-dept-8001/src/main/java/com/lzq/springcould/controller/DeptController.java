package com.lzq.springcould.controller;

import com.lzq.springcloud.pojo.Dept;
import com.lzq.springcould.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService service;

    @GetMapping("/queryDept")
    public List<Dept> method(){
       return service.queryAll();
    }
}
