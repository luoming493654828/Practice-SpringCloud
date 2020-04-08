package com.dailywear.node01.fallback;

import com.dailywear.node01.service.TestSpringCloudFeignService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class TestSpringCloudFeignServiceImpl implements TestSpringCloudFeignService {
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello " + name + ", i am fallback massage";
    }
}