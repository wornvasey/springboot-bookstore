package org.springboot.bookstore.service;

import org.springboot.bookstore.pojo.Book;

import java.util.List;

/**
 * Book 业务接口层
 */
public interface BookStoreService {

    int insert(Book book);

    int delete(Long id);

    int update(Book book);

    Book findById(Long id);

    List<Book> findAll();
}
