package com.renmaituan.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by lishangjin on 16/9/16.
 */
@Service
public class ComputeService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "addServiceFallback")
    public String add(){
        return restTemplate.getForEntity("http://COMPUTE-SERVICE/compute/add?a=10&b=20", String.class).getBody();
    }

    public String addServiceFallback(){
        return "error";
    }

}
