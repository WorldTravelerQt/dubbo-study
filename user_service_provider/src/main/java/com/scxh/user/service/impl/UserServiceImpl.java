package com.scxh.user.service.impl;

import com.scxh.dubbo.pojo.UserAddress;
import com.scxh.dubbo.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 乔童
 * @Description: 用户服务实现类
 * @Date: 2019/12/18 8:49
 * @Version: 1.0
 */
public class UserServiceImpl implements UserService {
    @Override
    public List<UserAddress> findAll(String userId) {
        UserAddress userAddress = new UserAddress(1, "花果山水帘洞", userId, "行者孙", "121828122", true);
        ArrayList<UserAddress> userAddresses=new ArrayList<>();
        userAddresses.add(userAddress);
        return userAddresses;
    }
}
