package com.aaa.lwt.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Classname ApplicationRun8084
 * @Description 集成hystrix的provider启动类
 * @Date 2020/5/6 10:17
 * @Created by Snow Lee
 */
@SpringBootApplication
@MapperScan("com.aaa.lwt.springcloud.mapper")
@EnableDiscoveryClient

/*hystrix熔断注解*/
@EnableCircuitBreaker
public class ApplicationRun8084 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8084.class, args);
    }
}
