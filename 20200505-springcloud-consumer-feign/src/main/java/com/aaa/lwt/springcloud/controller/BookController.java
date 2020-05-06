package com.aaa.lwt.springcloud.controller;

import com.aaa.lwt.springcloud.model.Book;
import com.aaa.lwt.springcloud.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Classname BookController
 * @Description 集成了feign的consumer的controller请求控制层
 * @Date 2020/5/6 10:04
 * @Created by Snow Lee
 */
@RestController
public class BookController {

    @Autowired
    private IBookService bookService;

    /**
     *
     * @Description 获取所有图书信息
     * @param
     * @return
     * @date 2020/5/6 10:08
     * @auther Snow Lee
     */
    @GetMapping("/all")
    public List<Book> getAllBooks(){
        return bookService.selectAllBooks();
    }
}
