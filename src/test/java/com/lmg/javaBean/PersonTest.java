package com.lmg.javaBean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @SpringBootTest  获取启动类、加载配置，确定装载Spring Boot；
 * @RunWith(SpringRunner.class)  标识为JUnit的运行环境；
 *
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class PersonTest {

    @Autowired
    private Person person;

    @Test //声明需要测试的方法；
    public void test1(){
        System.out.println(person.toString());
    }
}
