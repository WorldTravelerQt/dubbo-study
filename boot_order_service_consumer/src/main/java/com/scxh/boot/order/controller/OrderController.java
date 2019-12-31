package com.scxh.boot.order.controller;

import com.scxh.dubbo.pojo.UserAddress;
import com.scxh.dubbo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: 乔童
 * @Description: 订单控制层
 * @Date: 2019/12/18 9:14
 * @Version: 1.0
 */
@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;
    @RequestMapping("/all")
    @ResponseBody
    public List<UserAddress> findAll()
    {
        return orderService.initOrder("A01");
    }
}
