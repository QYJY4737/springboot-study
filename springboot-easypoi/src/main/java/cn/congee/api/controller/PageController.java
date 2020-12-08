package cn.congee.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: yang
 * @Date: 2020-12-08 7:59
 */
@Controller
public class PageController {

    @GetMapping(value = {"","/","/index"})
    public String index(){
        return "index";
    }

}
