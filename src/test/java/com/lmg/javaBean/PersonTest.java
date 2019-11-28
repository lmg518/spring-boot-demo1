package com.lmg.javaBean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
public class PersonTest {

    @Autowired
    private Person person;

    @Test
    public void test1(){
        System.out.println(person.toString());
    }
}
