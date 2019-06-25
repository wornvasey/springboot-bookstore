package org.springboot.bookstore.dao;

import org.springboot.bookstore.pojo.Book;

import java.util.List;

/**
 * BookDao 接口类
 */
public interface BookDao {
    void insert(Book book);
    Book delete(Long id);
    Book update(Book book);
    Book findById(Long id);
    List<Book> findAll();
}
