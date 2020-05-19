package com.lc.cn.controller;

import com.lc.cn.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@RestController
public class DeptConsumerDiscoveryController {


    @Autowired
    private DiscoveryClient client;

    @Autowired
    private RestTemplate restTemplate;


    @PostMapping(value="/dept/dis/add")
    public boolean add(@RequestBody Dept dept){
        List<ServiceInstance> serviceList = client.getInstances("MICROSERVICECLOUD-DEPT");
        serviceList.get(0).getUri();
        return true;
    }
    @GetMapping(value="/dept/dis/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return null;

    }
    @GetMapping(value="/dept/dis/list")
    public List<Dept> list(){

        List<ServiceInstance> serviceInstanceList = client.getInstances("MICROSERVICECLOUD-DEPT");
        for(ServiceInstance si:serviceInstanceList){
            System.out.println(si.getUri());
        }
        return restTemplate.getForObject(serviceInstanceList.get(0).getUri()+"/dept/list",List.class);
    }

}
