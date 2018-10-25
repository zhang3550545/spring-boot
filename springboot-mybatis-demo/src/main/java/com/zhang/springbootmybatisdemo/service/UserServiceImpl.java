package com.zhang.springbootmybatisdemo.service;

import com.zhang.springbootmybatisdemo.bean.ConnectBean;
import com.zhang.springbootmybatisdemo.dao.UserDao;
import com.zhang.springbootmybatisdemo.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;

    @Autowired
    private ConnectBean connectBean;

    @Override
    public int addUser(User user) {
        logger.info("addUser: " + user);
        return userDao.add(user);
    }

    @Override
    public User searchById(String userId) {
        logger.info("searchById: " + userId);
        return userDao.searchById(userId);
    }

    @Override
    public List<User> searchAll() {
        logger.info("searchAll");
        logger.info(connectBean.toString());
        return userDao.searchAll();
    }
}
