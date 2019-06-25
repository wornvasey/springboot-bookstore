package org.springboot.bookstore.service.impl;

import org.springboot.bookstore.dao.BookDao;
import org.springboot.bookstore.pojo.Book;
import org.springboot.bookstore.service.BookStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Book 业务层实现
 */
@Service
public class BookStoreServiceImpl implements BookStoreService {

    @Autowired
    private BookDao bookDao;

    // 模拟数据库，存储 Book 信息
    // 第五章《﻿数据存储》会替换成 H2 数据源存储
    private static Map<Long, Book> BOOK_DB = new HashMap<>();

    @Override
    public void insert(Book book) {
        bookDao.insert(book);
//        book.setId(BOOK_DB.size() + 1L);
//        BOOK_DB.put(book.getId(), book);
//        return book;
    }

    @Override
    public Book delete(Long id) {
        return bookDao.delete(id);
//        return BOOK_DB.remove(id);
    }

    @Override
    public Book update(Book book) {
        return bookDao.update(book);
//        BOOK_DB.put(book.getId(), book);
//        return book;
    }

    @Override
    public Book findById(Long id) {
        return bookDao.findById(id);
//        return BOOK_DB.get(id);
    }
    @Override
    public List<Book> findAll() {
        return bookDao.findAll();
//        return new ArrayList<>(BOOK_DB.values());
    }
}
