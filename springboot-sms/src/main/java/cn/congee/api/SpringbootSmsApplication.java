package cn.congee.api;

import cn.congee.api.utils.PortUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @Author: yang
 * @Date: 2020-12-08 7:17
 */
@Slf4j
@SpringBootApplication
public class SpringbootSmsApplication extends SpringBootServletInitializer {

    static {
        PortUtils.checkPort(6379, "Redis 服务端", true);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringbootSmsApplication.class);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        SpringApplication.run(SpringbootSmsApplication.class,args);
        long end = System.currentTimeMillis();
        log.info("整合篇---邮件短信---SpringBoot 整合 SMS 阿里短信服务---服务启动耗时为：" + (end - start) + "ms");
    }

}
