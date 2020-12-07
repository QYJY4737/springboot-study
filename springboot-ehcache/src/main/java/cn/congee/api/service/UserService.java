package cn.congee.api.service;

import cn.congee.api.entity.User;

import java.util.List;

/**
 * @Author: yang
 * @Date: 2020-12-08 3:20
 */
public interface UserService {

    void insert(User user);

    void update(User user);

    void delete(Long id);

    User get(Long id);

    List<User> list();

}
