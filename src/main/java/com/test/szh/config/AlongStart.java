package com.test.szh.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author songzehui
 * @email <a href="mailto:songzehui@gtmap.cn">Email To</a>
 * @date 2020/11/3 17:27
 * @desc com.test.szh.config:
 */
@Component
@Order(value = 1)
public class AlongStart implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("ssssssssssssssssssssqqqq");
    }
}
