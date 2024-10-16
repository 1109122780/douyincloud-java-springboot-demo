package com.bytedance.douyinclouddemo.service.impl;
import com.bytedance.douyinclouddemo.service.HelloService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
@Qualifier("mongo")
public class HelloServiceMongoImpl implements HelloService {
//    @Resource
//    private MongoTemplate mongoTemplate;

    @Override
    public String hello(String target) {
        return "Hello Mongo";
    }

    @Override
    public void setName(String target, String name) {
    }
}
