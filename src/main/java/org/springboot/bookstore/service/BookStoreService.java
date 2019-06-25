package org.springboot.bookstore.service;

import org.springboot.bookstore.pojo.Book;

import java.util.List;

/**
 * Book 业务接口层
 */
public interface BookStoreService {
    /**
     * 新增 Book
     *
     * @param book {@link Book}
     */
    void insert(Book book);

    /**
     * 删除 Book
     *
     * @param id 编号
     */
    Book delete(Long id);

    /**
     * 更新 Book
     *
     * @param book {@link Book}
     */
    Book update(Book book);

    /**
     * 获取 Book
     *
     * @param id 编号
     */
    Book findById(Long id);
    /**
     * 获取所有 Book
     */
    List<Book> findAll();
}
