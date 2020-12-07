package cn.congee.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @Author: yang
 * @Date: 2020-12-07 12:48
 */
@Slf4j
@SpringBootApplication
public class SpringbootSwagger2Application extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringbootSwagger2Application.class);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        SpringApplication.run(SpringbootSwagger2Application.class, args);
        long end = System.currentTimeMillis();
        log.info("基础篇---SpringBoot 配置 Swagger2 实现 restfull风格 API 文档---服务启动耗时为：" + (end - start) + "ms");
    }

}
