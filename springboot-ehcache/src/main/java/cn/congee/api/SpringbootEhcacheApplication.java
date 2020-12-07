package cn.congee.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @Author: yang
 * @Date: 2020-12-08 3:17
 */
@Slf4j
@SpringBootApplication
public class SpringbootEhcacheApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringbootEhcacheApplication.class);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        SpringApplication.run(SpringbootEhcacheApplication.class,args);
        long end = System.currentTimeMillis();
        log.info("整合篇---缓存---SpringBoot 整合 Ehcache 高性能缓存---服务启动耗时为：" + (end - start) + "ms");
    }

}
