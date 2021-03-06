package com.itou86.bookmarket.service;

import com.itou86.bookmarket.domain.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>书籍管理</p>
 *
 * @author : Itou86
 * @version : 1.1.0
 * @date : 2021-06-16 20:57
 **/
public interface BookService {

    /**
     * 查询全部书籍记录
     *
     * @return 所有的书籍记录
     */
    List<Books> selectAllBook();

    /**
     * 根据书籍ID查询书籍记录
     *
     * @param id 书籍ID
     * @return 根据书籍ID查询到的书籍
     */
    Books selectBookById(Integer id);

    /**
     * 根据书籍名称查询书籍记录
     *
     * @param bookName 书籍名称
     * @return 根据书籍名称查询到的书籍
     */
    List<Books> selectBookByBookName(@Param("bookName") String bookName);

    /**
     * 增加书籍记录
     *
     * @param books 书籍实例
     */
    int addBook(Books books);

    /**
     * 根据书籍ID删除书籍记录
     *
     * @param id 书籍ID
     */
    int deleteBookById(Integer id);

    /**
     * 更新书籍记录
     *
     * @param books 书籍记录
     */
    int updateBook(Books books);

}
