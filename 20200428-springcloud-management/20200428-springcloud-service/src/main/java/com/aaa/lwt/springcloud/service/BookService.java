package com.aaa.lwt.springcloud.service;

import com.aaa.lwt.springcloud.mapper.BookMapper;
import com.aaa.lwt.springcloud.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname BookService
 * @Description 图书操作业务逻辑层
 * @Date 2020/4/28 10:54
 * @Created by Snow Lee
 */
@Service
public class BookService {
    @Autowired
    private BookMapper bookMapper;

    /**
     *
     * @Description 查询所有的图书信息
     * @param
     * @return
     * @date 2020/4/28 10:56
     * @auther Snow Lee
     */
    public List<Book> getAllBook(){
        return bookMapper.selectAll();
    }
}
