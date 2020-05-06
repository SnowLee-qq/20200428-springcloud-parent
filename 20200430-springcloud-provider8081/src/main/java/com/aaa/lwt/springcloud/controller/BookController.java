package com.aaa.lwt.springcloud.controller;

import com.aaa.lwt.springcloud.model.Book;
import com.aaa.lwt.springcloud.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Classname BookController
 * @Description provider的请求控制层
 * @Date 2020/5/4 22:55
 * @Created by Snow Lee
 */
@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/all")
    public List<Book> selectAllBooks() {
        System.out.println("调用provider8081");
        return bookService.getAllBook();
    }
}
