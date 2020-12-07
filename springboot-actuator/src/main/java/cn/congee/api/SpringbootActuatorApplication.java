package cn.congee.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @Author: yang
 * @Date: 2020-12-07 12:43
 */
@Slf4j
@SpringBootApplication
public class SpringbootActuatorApplication extends SpringBootServletInitializer {

    /**
     * 官方API
     * https://docs.spring.io/spring-boot/docs/current/reference/html/production-ready-endpoints.html
     */

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringbootActuatorApplication.class);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        SpringApplication.run(SpringbootActuatorApplication.class, args);
        long end = System.currentTimeMillis();
        log.info("基础篇---SpringBoot 配置 Actuator 监控---服务启动耗时为：" + (end - start) + "ms");
    }

}
