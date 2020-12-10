package com.test.szh.web;

import com.test.szh.service.GenericTable;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private GenericTable genericTable;

    @GetMapping("")
    public String index(){
        genericTable.createTable();
        return "hello!";
    }
}
