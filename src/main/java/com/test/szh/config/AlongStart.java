package com.test.szh.config;

import com.test.szh.staticBlock.TestSon;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author songzehui
 * @email <a href="mailto:songzehui@gtmap.cn">Email To</a>
 * @date 2020/11/3 17:27
 * @desc com.test.szh.config:
 */
@Component
@Order(value = 1)
public class AlongStart implements CommandLineRunner {
//    TestPrent as = new TestPrent("aa",12);
//    Class<TestPrent> Ats = TestPrent.class;
//    Class ats = as.getClass();

    TestSon ts = new TestSon("song",12);
    String      name = ts.getName();
    Set<String> setSm  = new CopyOnWriteArraySet<>();
    @Override
    public void run(String... args) throws Exception {
        test();
        System.out.println(setSm);
        System.out.println("ssssssssssssssssssssqqqq");
//        System.out.println(Ats==ats);
    }

    /**
     * 测试CopyOnWriteArraySet性能
     */
    private void test(){
        for (int i = 0;i<1000;i++){
            setSm.add("sssss");
        }
    }
}
