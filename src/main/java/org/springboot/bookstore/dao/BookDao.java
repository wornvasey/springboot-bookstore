package org.springboot.bookstore.dao;

import org.springboot.bookstore.pojo.Book;

import java.util.List;

/**
 * BookDao 接口类
 */
public interface BookDao {
    int insert(Book book);
    int delete(Long id);
    int update(Book book);
    Book findById(Long id);
    List<Book> findAll();
}
