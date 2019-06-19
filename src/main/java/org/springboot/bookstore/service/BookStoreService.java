package org.springboot.bookstore.service;

import org.springboot.bookstore.domain.Book;

import java.util.List;

/**
 * Book 业务接口层
 */
public interface BookStoreService {
    /**
     * 获取所有 Book
     */
    List<Book> findAll();

    /**
     * 新增 Book
     *
     * @param book {@link Book}
     */
    Book insertByBook(Book book);

    /**
     * 更新 Book
     *
     * @param book {@link Book}
     */
    Book update(Book book);

    /**
     * 删除 Book
     *
     * @param id 编号
     */
    Book delete(Long id);

    /**
     * 获取 Book
     *
     * @param id 编号
     */
    Book findById(Long id);
}
