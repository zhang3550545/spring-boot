package com.zhang.springbootmybatisdemo.dao;

import com.zhang.springbootmybatisdemo.domain.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserDao {
    int add(User user);
    User searchById(String userId);
    List<User> searchAll();
}
