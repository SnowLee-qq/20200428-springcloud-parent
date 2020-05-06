package com.aaa.lwt.springcloud.mapper;

import com.aaa.lwt.springcloud.model.Book;

import java.util.List;

public interface BookMapper {
    int deleteByPrimaryKey(Long bookId);

    int insert(Book record);

    Book selectByPrimaryKey(Long bookId);

    List<Book> selectAll();

    int updateByPrimaryKey(Book record);
}