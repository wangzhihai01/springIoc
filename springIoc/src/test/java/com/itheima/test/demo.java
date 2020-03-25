package com.itheima.test;

import com.itheima.dao.userDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: springIoc
 * @description:
 * @author: WZH
 * @create: 2020-03-23 15:46
 **/

public class demo {

    @Test
    public void test1(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        userDao userDao = (userDao) app.getBean("userDao");
        userDao.save();
    }

}
