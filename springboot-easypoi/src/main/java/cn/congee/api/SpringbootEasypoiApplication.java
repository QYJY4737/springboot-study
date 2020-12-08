package cn.congee.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Author: yang
 * @Date: 2020-12-08 7:45
 */
@Slf4j
@SpringBootApplication
@MapperScan("cn.congee.api.mapper")
public class SpringbootEasypoiApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringbootEasypoiApplication.class);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        SpringApplication.run(SpringbootEasypoiApplication.class,args);
        long end = System.currentTimeMillis();
        log.info("整合篇---中间件---SpringBoot 整合 Easypoi 打印报表---服务启动耗时为：" + (end - start) + "ms");
    }

}
