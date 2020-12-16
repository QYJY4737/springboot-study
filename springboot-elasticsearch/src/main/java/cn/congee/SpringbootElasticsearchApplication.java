package cn.congee;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @Author: yang
 * @Date: 2020-12-16 9:15
 */
@Slf4j
@SpringBootApplication
public class SpringbootElasticsearchApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringbootElasticsearchApplication.class);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        SpringApplication.run(SpringbootElasticsearchApplication.class, args);
        long end = System.currentTimeMillis();
        log.info("集成日志收集系统服务启动耗时: " + (end - start) + "ms");
    }

}
