package cn.congee.api.service.impl;

import cn.congee.api.entity.User;
import cn.congee.api.mapper.UserMapper;
import cn.congee.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: yang
 * @Date: 2020-12-08 7:53
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public void insertList(List<User> list) {
        userMapper.insertList(list);
    }
}
