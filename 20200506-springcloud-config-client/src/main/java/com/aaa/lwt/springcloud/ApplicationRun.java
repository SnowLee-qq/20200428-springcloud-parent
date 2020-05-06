package com.aaa.lwt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Classname ApplicationRun
 * @Description 分布式配置中心的客户端启动类
 * @Date 2020/5/6 19:43
 * @Created by Snow Lee
 */
@SpringBootApplication
public class ApplicationRun {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun.class, args);
    }
}
