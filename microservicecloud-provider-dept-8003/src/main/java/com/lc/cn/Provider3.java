package com.lc.cn;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.lc.cn.mapper")
@EnableEurekaClient
public class Provider3 {
    public static void main( String[] args ) {
        SpringApplication.run(Provider3.class,args);
    }
}
