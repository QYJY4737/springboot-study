package cn.congee.api.controller;

import cn.congee.api.dto.ResponseCode;
import cn.congee.api.entity.User;
import cn.congee.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yang
 * @Date: 2020-12-07 10:55
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    // 测试响应结果
    @GetMapping("")
    public ResponseCode test() {
        return ResponseCode.success();
    }

    // service.impl报错，测试事物是否回滚
    @GetMapping("list")
    public void insertList() {
        List<User> list = new ArrayList<>();
        list.add(new User("Tom", "111111"));
        list.add(new User("Susan", "222222"));
        list.add(new User("Sky", "333333"));
        list.add(new User("", "444444"));
        list.add(new User("Bang", "555555"));
        userService.insertList(list);
    }

}
