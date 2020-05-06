package com.aaa.lwt.springcloud.controller;

import com.aaa.lwt.springcloud.model.Book;
import com.aaa.lwt.springcloud.service.BookService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Classname BookController
 * @Description 集成hystrix的provider请求控制层
 * @Date 2020/5/6 10:19
 * @Created by Snow Lee
 */
@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/all")
    /*熔断注解*/
    //@HystrixCommand(fallbackMethod = "selectAllBooksFallback")
    /*一般熔断都写在api项目中，对熔断进行统一的处理*/
    public List<Book> selectAllBooks() throws Exception {
        List<Book> bookList = bookService.getAllBook();
        if(bookList.size() > 0) {
            // 说明数据库中有值，说明程序是对的(按照咱们目前的情况，一定会进if中)
            // 所以直接抛出异常
            throw new Exception("故意抛出异常");// 必会抛出异常,让其走熔断
        }
        return bookList;
    }

    /*public List<Book> selectAllBooksFallback() {
        List<Book> bookList = new ArrayList<Book>();
        Book book = new Book();
        book.setId(100000L);
        book.setBookName("测试异常熔断");
        bookList.add(book);
        return bookList;
    }*/
}
