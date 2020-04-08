package com.dailywear.dailywearconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "dailywear-producer")
public interface TestSpringCloudFeignService {
    @RequestMapping(value = "/hello")
    String hello(@RequestParam(value = "name") String name);
}