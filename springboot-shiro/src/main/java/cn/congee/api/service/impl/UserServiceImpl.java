package cn.congee.api.service.impl;

import cn.congee.api.entity.User;
import cn.congee.api.repository.UserRepository;
import cn.congee.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: yang
 * @Date: 2020-12-08 3:54
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }

}
