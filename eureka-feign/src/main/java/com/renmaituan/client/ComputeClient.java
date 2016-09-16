package com.renmaituan.client;

import com.renmaituan.client.hystrix.ComputeClientHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by lishangjin on 16/9/16.
 */
@FeignClient(value = "COMPUTE-SERVICE", fallback = ComputeClientHystrix.class)
public interface ComputeClient {

    @RequestMapping(value = "/compute/add", method = {RequestMethod.GET})
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);

}
