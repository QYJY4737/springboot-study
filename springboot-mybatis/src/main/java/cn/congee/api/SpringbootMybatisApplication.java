package cn.congee.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Author: yang
 * @Date: 2020-12-08 2:00
 */
@Slf4j
@ComponentScan(basePackages = "cn.congee.*")
@MapperScan(value = "cn.congee.mapper")
@SpringBootApplication
public class SpringbootMybatisApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringbootMybatisApplication.class);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        SpringApplication.run(SpringbootMybatisApplication.class,args);
        long end = System.currentTimeMillis();
        log.info("整合篇---持久层---SpringBoot 整合 Mybatis---服务启动耗时为：" + (end - start) + "ms");
    }

}
