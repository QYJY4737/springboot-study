package cn.congee.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @Author: yang
 * @Date: 2020-12-08 4:21
 */
@Slf4j
@SpringBootApplication
public class SpringbootJwtRsaApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringbootJwtRsaApplication.class);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        SpringApplication.run(SpringbootJwtRsaApplication.class,args);
        long end = System.currentTimeMillis();
        log.info("整合篇---权限---SpringBoot 整合 JWT + RSA 分布式授权---服务启动耗时为：" + (end - start) + "ms");
    }

}
