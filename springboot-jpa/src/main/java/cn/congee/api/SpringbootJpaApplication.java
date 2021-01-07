package cn.congee.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import javax.annotation.PostConstruct;

/**
 * @Author: yang
 * @Date: 2020-12-08 2:22
 */
@Slf4j
@SpringBootApplication
public class SpringbootJpaApplication extends SpringBootServletInitializer {

    @Value("${server.port}")
    private String port;

    private static String SERVER_PORT;

    @PostConstruct
    private void init(){
        SERVER_PORT = port;
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringbootJpaApplication.class);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        SpringApplication.run(SpringbootJpaApplication.class,args);
        long end = System.currentTimeMillis();
        log.info("整合篇---持久层---SpringBoot 整合 SpringData JPA---服务启动耗时为：" + (end - start) + "ms,端口为: " + SERVER_PORT);
    }

}
