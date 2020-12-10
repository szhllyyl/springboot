package com.test.szh.staticBlock;

import com.test.szh.staticBlock.TestParent;

/**
 * @author songzehui
 * @email <a href="mailto:songzehui@gtmap.cn">Email To</a>
 * @date 2020/11/4 11:27
 * @desc com.test.szh.config:
 */
public class TestSon extends TestParent {
    static{
        System.out.println("son 静态代码块");
    }
    {
        System.out.println("son 非静态代码块");
    }
    public TestSon(String name, Integer age) {
        super(name, age);
        System.out.println("son name age");
    }

    public TestSon() {
        System.out.println("son black");
    }
    private TestParent parent = new TestParent();
}
