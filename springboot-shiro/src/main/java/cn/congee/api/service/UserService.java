package cn.congee.api.service;

import cn.congee.api.entity.User;

/**
 * @Author: yang
 * @Date: 2020-12-08 3:53
 */
public interface UserService {

    User findByUserName(String userName);

}
