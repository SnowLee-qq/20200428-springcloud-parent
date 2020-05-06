package com.aaa.lwt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Classname ApplicationRun6082
 * @Description 实现ribbon的consumer的启动类
 * @Date 2020/5/4 22:30
 * @Created by Snow Lee
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationRun6082 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun6082.class, args);
    }
}
