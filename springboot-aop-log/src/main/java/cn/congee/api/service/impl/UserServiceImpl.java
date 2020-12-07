package cn.congee.api.service.impl;

import cn.congee.api.annotation.SystemServiceLog;
import cn.congee.api.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author: yang
 * @Date: 2020-12-07 12:31
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    @SystemServiceLog(description = "测试service层日志打印")
    public String test() {
        return "测试service层日志打印";
    }

}
