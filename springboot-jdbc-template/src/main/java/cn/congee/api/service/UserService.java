package cn.congee.api.service;

import cn.congee.api.entity.User;

import java.util.List;

/**
 * @Author: yang
 * @Date: 2020-12-08 2:38
 */
public interface UserService {

    User getUserById(Long id);

    List<User> getUserList();

    int add(User user);

    int update(User user);

    int delete(Long id);

}
