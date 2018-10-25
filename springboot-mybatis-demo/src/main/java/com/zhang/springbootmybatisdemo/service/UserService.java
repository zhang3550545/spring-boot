package com.zhang.springbootmybatisdemo.service;

import com.zhang.springbootmybatisdemo.domain.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserService {
    int addUser(User user);

    User searchById(String userId);

    List<User> searchAll();
}
