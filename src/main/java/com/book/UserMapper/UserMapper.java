package com.book.UserMapper;

import com.book.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UserMapper {
    User user(@Param("userName")String userName,@Param("password")String password);

    int addUser(User user);
}
