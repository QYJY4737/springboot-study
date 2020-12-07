package cn.congee.api.service;

import cn.congee.api.entity.User;

/**
 * @Author: yang
 * @Date: 2020-12-08 6:09
 */
public interface AuthService {

    String login(String username, String password);

    User selectByNamePwd(String username, String password);

    void register(User user);

}
