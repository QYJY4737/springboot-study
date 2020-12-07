package cn.congee.api.controller;

import cn.congee.api.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yang
 * @Date: 2020-12-08 7:26
 */
@RestController
public class SmsController {

    @Autowired
    private SmsService smsService;

    /**
     * 发送短信
     *
     * @param phone
     * @return
     */
    @PostMapping("code")
    public String sendCode(@RequestParam("phone") String phone) {
        smsService.sendCode(phone);
        return "发送短信到：" + phone;
    }

}
