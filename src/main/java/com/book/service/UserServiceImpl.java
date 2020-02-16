package com.book.service;

import com.book.UserMapper.UserMapper;
import com.book.pojo.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService{
    @Resource
    UserMapper userMapper;
    /*@Transactional(rollbackFor = Exception.class)*/
    @Override
    public void addUser(int number) {
        User user = new User();
        user.setUser_Code("zx");
        user.setPassword("123");
        userMapper.addUser(user);

        int num = 10/number;

        User user2 = new User();
        user2.setUser_Code("yqs");
        user2.setPassword("321");
        userMapper.addUser(user2);
    }
}
