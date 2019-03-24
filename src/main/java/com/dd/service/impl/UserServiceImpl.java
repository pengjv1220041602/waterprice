package com.dd.service.impl;

import com.dd.bean.User;
import com.dd.dao.UserDao;
import com.dd.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;


    @Override
    public boolean insertUser(User user) {
        return userDao.insertUser(user) > 0;
    }

    @Override
    public boolean updateUser(User user) {
        return userDao.updateUser(user) > 0;
    }

    @Override
    public List<User> listUser(User user) {
        return userDao.listUsers(user);
    }
}
