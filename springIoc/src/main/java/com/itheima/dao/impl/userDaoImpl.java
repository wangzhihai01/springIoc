package com.itheima.dao.impl;

import com.itheima.dao.userDao;

/**
 * @program: springIoc
 * @description:
 * @author: WZH
 * @create: 2020-03-22 17:21
 **/
public class userDaoImpl implements userDao {
    @Override
    public void save() {
        System.out.println("userDao save method running... ");
    }
}
