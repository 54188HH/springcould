package com.lzq.springcould.service;

import com.lzq.springcould.pojo.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: springcould
 * @description:
 * @author: liuzhenqi
 * @create: 2020-05-22 13:53
 **/
@Component
public class DeptClientServiceFallBackFactory implements FallbackFactory {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public List<Dept> queryDept() {
                List<Dept> list = new ArrayList<>();
                Dept dept = new Dept();
                dept.setDbSource("没有数据");
                dept.setDeptId(111);
                dept.setDeptName("服务器维护中暂不提供服务");
                list.add(dept);
                return list;
            }
        };
    }
}
