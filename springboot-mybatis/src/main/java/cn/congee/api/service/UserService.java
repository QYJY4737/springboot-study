package cn.congee.api.service;

import cn.congee.api.entity.User;

/**
 * @Author: yang
 * @Date: 2020-12-08 2:05
 */
public interface UserService {

    void insert(User user);

    void update(User user);

    void delete(Long id);

    void get(Long id);

    void list();

    void page();

    void pageByExample();

}
