package com.bytedance.douyinclouddemo.service.impl;

import com.bytedance.douyinclouddemo.service.HelloService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("redis")
public class HelloServiceRedisImpl implements HelloService {
//    @Autowired
//    private StringRedisTemplate redisTemplate;

    @Override
    public String hello(String target) {
        return "hello Redis";
    }

    @Override
    public void setName(String target, String name) {
    }
}
