package com.lzq.springcould.controller;

import com.lzq.springcould.pojo.Dept;
import com.lzq.springcould.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DtController {
    @Autowired
    private DeptClientService deptClientService = null;

    @RequestMapping("/queryDept")
    public List<Dept> list(){
         return this.deptClientService.queryDept();
    }
}
