package com.aaa.lwt.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Classname ApplicationRun8081
 * @Description provider8082的启动类
 * @Date 2020/5/4 22:44
 * @Created by Snow Lee
 */
@SpringBootApplication
@MapperScan("com.aaa.lwt.springcloud.mapper")
@EnableDiscoveryClient
public class ApplicationRun8082 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8082.class, args);
    }
}
