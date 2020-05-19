package com.lzq.springcould.service;

import com.lzq.springcould.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Component
@FeignClient(value="SPRINGCOULD-DEPT")
public interface DeptClientService {
    @GetMapping("/queryDept")
    public List<Dept> queryDept();
}
