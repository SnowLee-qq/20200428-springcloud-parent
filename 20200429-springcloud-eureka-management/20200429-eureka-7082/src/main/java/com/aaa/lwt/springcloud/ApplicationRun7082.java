package com.aaa.lwt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Classname ApplicationRun7081
 * @Description eureka服务的启动类
 *      无论是springboot项目还是springcloud项目，只有三步:
 *           1.添加所需要的jar包
 *           2.编写配置文件
 *           3.集成自动装配注解
 * @Date 2020/5/4 21:38
 * @Created by Snow Lee
 */
@SpringBootApplication
/*eureka的服务器端注解*/
@EnableEurekaServer
public class ApplicationRun7082 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun7082.class, args);
    }
}
