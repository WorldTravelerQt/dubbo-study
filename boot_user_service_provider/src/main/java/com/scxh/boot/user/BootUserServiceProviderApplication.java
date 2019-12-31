package com.scxh.boot.user;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1、服务提供者在注册中心注册，提供自己的服务(暴露服务)
 *   导入依赖：dubbo-starter
 *   开启Dubbo：@EnableDubbo
 *
 * 2.服务消费者到注册中心指定需要的服务(订阅服务)
 */
@EnableDubbo
@SpringBootApplication
public class BootUserServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootUserServiceProviderApplication.class, args);
    }

}
