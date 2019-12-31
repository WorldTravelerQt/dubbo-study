package com.scxh.user;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Author: 乔童
 * @Date: 2019/12/18 8:57
 * @Version: 1.0
 */
public class MainApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext(new String[]{"classpath:provider.xml"});
        context.start();
        System.in.read();
    }
}
