package com.aaa.lwt.springcloud.controller;

import com.aaa.lwt.springcloud.model.Book;
import com.aaa.lwt.springcloud.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Classname BookController
 * @Description 生产者的请求控制层
 * @Date 2020/4/28 10:57
 * @Created by Snow Lee
 */
@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    /**
     *
     * @Description 查询所有的图书信息的请求
     * @param
     * @return
     * @date 2020/4/28 10:59
     * @auther Snow Lee
     */
    @GetMapping("/getAllbook")
    public List<Book> getAllBook(){
        return bookService.getAllBook();
    }
}
