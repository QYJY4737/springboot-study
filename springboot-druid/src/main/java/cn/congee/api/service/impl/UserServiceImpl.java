package cn.congee.api.service.impl;

import cn.congee.api.entity.User;
import cn.congee.api.mapper.UserMapper;
import cn.congee.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @Author: yang
 * @Date: 2020-12-07 12:18
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> list() {
        List<User> list = userMapper.selectAll();
        if (!CollectionUtils.isEmpty(list)) {
            return list;
        }
        return null;
    }

}
