package com.aaa.lwt.springcloud.controller;

import com.aaa.lwt.springcloud.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Classname BookController
 * @Description 消费者的请求控制层
 * @Date 2020/4/28 11:00
 * @Created by Snow Lee
 */
@RestController
public class BookController {

    @Autowired
    private RestTemplate restTemplate;

    /**
     *
     * @Description 消费者请求控制层
     *  最初的consumer版本，使用restful风格调用
     * @param
     * @return
     * @date 2020/4/28 11:02
     * @auther Snow Lee
     */
    @GetMapping("/bookAll")
    public List<Book> selectAllBook(){
        return restTemplate.getForObject("http://localhost:8081/getAllbook", List.class);
    }
}
