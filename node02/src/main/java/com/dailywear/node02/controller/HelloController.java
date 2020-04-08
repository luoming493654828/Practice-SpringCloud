package com.dailywear.node02.controller;

import com.dailywear.node02.service.TestSpringCloudFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    TestSpringCloudFeignService testSpringCloudFeignService;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return testSpringCloudFeignService.hello(name);
    }
}