package com.renmaituan.controller;

import com.renmaituan.service.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lishangjin on 16/9/16.
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private ComputeService computeService;

    @RequestMapping(value = "/add", method = {RequestMethod.GET})
    public String add(){
        return computeService.add();
    }

}
