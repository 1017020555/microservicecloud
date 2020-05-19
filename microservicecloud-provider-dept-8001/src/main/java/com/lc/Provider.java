package com.lc;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.lc.cn.mapper")
@EnableEurekaClient
public class Provider {
    public static void main( String[] args ) {
        SpringApplication.run(Provider.class,args);
    }
}
