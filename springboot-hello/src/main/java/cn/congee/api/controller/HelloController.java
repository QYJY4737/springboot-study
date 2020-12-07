package cn.congee.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: yang
 * @Date: 2020-12-07 10:05
 */
@Controller
public class HelloController {

    @RequestMapping("")
    @ResponseBody
    public String hello() {
        return "Hello SpringBoot！";
    }

}
