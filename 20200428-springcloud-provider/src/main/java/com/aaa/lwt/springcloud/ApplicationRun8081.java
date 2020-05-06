package com.aaa.lwt.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Classname ApplicationRun8081
 * @Description 生产者项目启动类
 * @Date 2020/4/28 10:24
 * @Created by Snow Lee
 */
@SpringBootApplication
@MapperScan("com.aaa.lwt.springcloud.mapper")

/*添加eureka客户端的注解*/
@EnableDiscoveryClient
public class ApplicationRun8081 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8081.class, args);
    }
}
