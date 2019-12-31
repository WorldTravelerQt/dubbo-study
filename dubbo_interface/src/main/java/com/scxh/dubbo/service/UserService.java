package com.scxh.dubbo.service;

import com.scxh.dubbo.pojo.UserAddress;

import java.util.List;

/**
 * @Author: 乔童
 * @Description: 用户服务接口
 * @Date: 2019/12/17 19:18
 * @Version: 1.0
 */
public interface UserService {
    List<UserAddress> findAll(String userId);
}
