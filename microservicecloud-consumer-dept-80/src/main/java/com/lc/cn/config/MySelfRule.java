package com.lc.cn.config;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
    修改默认的轮询（RoundRobinRule）为 随机(RandomRule)
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule ribbonRule(){
        return  new RandomRule();
    }

}
