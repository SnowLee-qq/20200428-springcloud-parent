package com.aaa.lwt.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Classname RestConfig
 * @Description ribbon的负载均衡算法
 @LoadBalanced:这个注解是ribbon组件提供，实现consumer调用provider的负载均衡模式
  *      如果不指定算法，则默认使用轮询
  *
  *      实战常用的负载均衡算法:
  *          BestAvailabelRule:
  *              选择一个最小的并发服务
  *
  *          RetryRule:(是按照轮询规则来做的)
  *                  重新连接
  *                  8081
  *                  8082
  *                  8083
  *                  客户端发送请求到达consumer--->通过ribbon调用provider(3台)
  *                  8081正常(第一次)
  *                  8082宕机(第二次)
  *                  8083宕机(第三次)
  *
  *                  下一轮的请求过来了(8081,8082,8083)
  *                  8082和8083就不访问了
  *                  默认值是0
  *                  这个值可以自定义更改0-->1
  *                  8081(第一次，正常)
  *                  8082(第二次，宕机)(第三次，宕机)
  *                  8083(第四次，正常)
  *
  *                  下一轮请求就会直接跳过8082，不再访问！
  *
  *            RoundRibbonRule:
  *              轮询
  *            RandomRule:
  *              随机
 * @Date 2020/5/4 22:33
 * @Created by Snow Lee
 */
@Configuration
public class RestConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
