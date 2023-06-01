package com.mhys.boot21yun;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import javax.annotation.Resource;

@SpringBootTest
public class HelloTest {
    @Resource
    private ApplicationContext ac;

    @Test
    public void test1(){

        boolean flag = ac.containsBean("helloService");
        if (flag){
            System.out.println("有");
        } else {
            System.out.println("无");
        }
    }
}
