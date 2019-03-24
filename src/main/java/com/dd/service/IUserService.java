package com.dd.service;

import com.dd.bean.User;

import java.util.List;

public interface IUserService {

    boolean insertUser(User user);

    boolean updateUser(User user);

    List<User> listUser(User user);
}
