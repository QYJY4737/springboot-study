package cn.congee.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @Author: yang
 * @Date: 2020-12-08 7:00
 */
@Slf4j
@SpringBootApplication
public class SpringbootEmailApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringbootEmailApplication.class);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        SpringApplication.run(SpringbootEmailApplication.class,args);
        long end = System.currentTimeMillis();
        log.info("整合篇---邮件短信---SpringBoot 整合 Email 发送邮件---服务启动耗时为：" + (end - start) + "ms");
    }

}
