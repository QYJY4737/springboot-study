package cn.congee.api.controller;

import cn.congee.api.annotation.SystemControllerLog;
import cn.congee.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yang
 * @Date: 2020-12-07 12:32
 */
@RestController
public class TestController {

    @Autowired
    private UserService userService;

    @GetMapping("get")
    @SystemControllerLog(description = "测试Get日志打印")
    public String get() {
        return "测试Get日志打印";
    }

    @PostMapping("post")
    @SystemControllerLog(description = "测试POST日志打印")
    public String post(@RequestParam("username") String username) {
        return "测试POST日志打印, 参数为：" + username;
    }

    @GetMapping("service")
    public String service() {
        return userService.test();
    }

}
