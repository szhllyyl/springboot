package com.test.szh.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author songzehui
 * @email <a href="mailto:songzehui@gtmap.cn">Email To</a>
 * @date 2020/11/3 16:05
 * @desc com.test.szh.web:
 */
@RequestMapping("/rest/v1/hello")
@RestController
public class HelloController {

    @GetMapping("")
    public String index(){
        return "hello!";
    }
}
