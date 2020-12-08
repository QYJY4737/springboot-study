package cn.congee.api.service;

import cn.congee.api.entity.User;

import java.util.List;

/**
 * @Author: yang
 * @Date: 2020-12-08 7:52
 */
public interface UserService {

    List<User> selectAll();

    void insertList(List<User> list);

}
