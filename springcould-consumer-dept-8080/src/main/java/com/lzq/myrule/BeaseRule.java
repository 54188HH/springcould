package com.lzq.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: springcould
 * @description:
 * @author: liuzhenqi
 * @create: 2020-05-19 14:15
 **/
@Configuration
public class BeaseRule {
    @Bean
    public IRule myRule(){
        //随机分配
        //默认的是轮训   现在是服务器每个服务器访问5次
        return new BaseRandomRule();
    }
}
