package com.aaa.lwt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Classname ApplicationRun3081
 * @Description 分布式服务配置中心服务端启动类
 * @Date 2020/5/6 19:33
 * @Created by Snow Lee
 */
@SpringBootApplication
@EnableConfigServer
public class ApplicationRun3081 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun3081.class, args);
    }
}
