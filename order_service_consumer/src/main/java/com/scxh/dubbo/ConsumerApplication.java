package com.scxh.dubbo;

import com.scxh.dubbo.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Author: 乔童
 * @Date: 2019/12/17 20:33
 * @Version: 1.0
 */
public class ConsumerApplication {
    public static void main(String[] args) throws IOException {
        OrderService orderService= (OrderService) new ClassPathXmlApplicationContext("conmuser.xml").getBean("orderService");
        orderService.initOrder("a01");
        System.in.read();
    }
}
