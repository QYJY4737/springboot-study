package cn.congee.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @Author: yang
 * @Date: 2020-12-07 9:35
 */
@Slf4j
@SpringBootApplication
public class SpringbootEchartsApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringbootEchartsApplication.class);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        SpringApplication.run(SpringbootEchartsApplication.class,args);
        long end = System.currentTimeMillis();
        log.info("中间件---SpringBoot 使用 Echars 实现数据可视化---服务启动耗时为：" + (end - start) + "ms");
    }


}
