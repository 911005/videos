package com.videos.course.customer;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author 隔壁_老陈
 * 代码风骚、效率恐怖、编译器深深鄙视智商。
 * 千里之外定位问题、瞬间修复依旧风骚……
 * @create 2023-07-24 10:41
 */


@SpringBootApplication
@EnableEurekaClient
@Slf4j
@MapperScan("com.videos.course.server.mapper")
@ComponentScan("com.videos.course")
public class CustomerApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(CustomerApplication.class);
        ConfigurableEnvironment environment = run.getEnvironment();
           log.info("customer  服务启动-【成功】");
           log.info("customer  请求地址\t http://127.0.0.1:{}",environment.getProperty("server.port"));
    }

}
