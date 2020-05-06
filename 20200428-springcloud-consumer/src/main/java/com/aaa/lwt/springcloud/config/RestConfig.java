package com.aaa.lwt.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Classname RestConfig
 * @Description
 *      springcloud这个架构给咱们提供的模拟http协议的工具类不叫HttpClient
 * @Date 2020/4/28 10:37
 * @Created by Snow Lee
 */
@Configuration
public class RestConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
