package com.lzq.springcould.service.serviceImpl;

import com.lzq.springcould.pojo.Dept;
import com.lzq.springcould.dao.DeptMapper;
import com.lzq.springcould.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper mapper;
    @Override
    public List<Dept> queryAll() {
        return mapper.queryAll();
    }
}
