package com.scxh.boot.order.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.scxh.dubbo.pojo.UserAddress;
import com.scxh.dubbo.service.OrderService;
import com.scxh.dubbo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 1、服务提供者到注册中心，提供自己的服务地址(暴露服务)
 *    1）导入dubbo依赖，操作zookeeper的客户端curator
 *    2）配置服务提供者
 *
 * 2、服务消费者到注册中心，订阅服务提供者的服务地址
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {
    @Reference
    private UserService userService;
    @Override
    public List<UserAddress> initOrder(String userId) {
        //1.查询用户的收货地址
        List<UserAddress> userAddresses = userService.findAll("a01");
        //2.打印用户所有收货地址
        for( UserAddress userAddress:userAddresses )
        {
            System.out.println("初始化用户收货地址--->>"+userAddress.getUserAddress());
        }
        return userAddresses;
    }
}
