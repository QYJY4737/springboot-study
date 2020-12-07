package cn.congee.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @Author: yang
 * @Date: 2020-12-07 10:06
 */
@SpringBootApplication
public class SpringbootHelloApplication extends SpringBootServletInitializer {

    private static final Logger log = LoggerFactory.getLogger(SpringbootHelloApplication.class);

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringbootHelloApplication.class);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        SpringApplication.run(SpringbootHelloApplication.class,args);
        long end = System.currentTimeMillis();
        log.info("基础篇---SpringBoot 入门案例 Hello World---服务启动耗时为：" + (end - start) + "ms");
    }
}
