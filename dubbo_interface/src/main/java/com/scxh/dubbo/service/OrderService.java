package com.scxh.dubbo.service;

import com.scxh.dubbo.pojo.UserAddress;

import java.util.List;

/**
 * @Author: 乔童
 * @Description: 订单服务接口
 * @Date: 2019/12/17 19:29
 * @Version: 1.0
 */
public interface OrderService {
    /**
     * 初始化订单
     */
    List<UserAddress> initOrder(String userId);
}
