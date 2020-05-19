package com.lzq.myrule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class BaseRandomRule extends AbstractLoadBalancerRule {
    /**
     * 每个服务访问5次  然后换下一个服务（总共3个服务）
    */
    private int total = 0; //被调用的次数
    private int currentIndex = 0; //当前是谁
    public BaseRandomRule() {
    }
    //@SuppressWarnings({"RCN_REDUNDANT_NULLCHECK_OF_NULL_VALUE"})
    public Server choose(ILoadBalancer lb, Object key) {
        if (lb == null) {
            return null;
        } else {
            Server server = null;

            while(server == null) {
                if (Thread.interrupted()) {
                    return null;
                }
                //获得活着的服务
                List<Server> upList = lb.getReachableServers();
                //获得所有的服务
                List<Server> allList = lb.getAllServers();
                int serverCount = allList.size();
                if (serverCount == 0) {
                    return null;
                }

        /**
         * 生成区间随机数
         * int index = this.chooseRandomInt(serverCount);
         * 从活着的服务随机获取一个
         * server =(Server)upList.get(index);
         */

        //通过修改源码 让负载均衡按照自己的意愿分配 访问的服务器
        if (total<5){
            server =(Server)upList.get(currentIndex);
            total++;
        }else{
            total = 0;
            currentIndex++;
            if(currentIndex>upList.size()){
                currentIndex=0;
            }
            upList.get(currentIndex);
        }
        if (server == null) {
                    Thread.yield();
                } else {
                    if (server.isAlive()) {
                        return server;
                    }

                    server = null;
                    Thread.yield();
                }
            }

            return server;
        }
    }

    protected int chooseRandomInt(int serverCount) {
        return ThreadLocalRandom.current().nextInt(serverCount);
    }

    @Override
    public Server choose(Object key) {
        return this.choose(this.getLoadBalancer(), key);
    }
    @Override
    public void initWithNiwsConfig(IClientConfig clientConfig) {
    }
}
