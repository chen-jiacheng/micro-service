package com.chenjiacheng.micro.micro.service.dubbo.service;

import com.chenjiacheng.micro.micro.service.dubbo.api.DemoService;

import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}