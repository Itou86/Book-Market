package com.itou86.bookmarket.service;

import com.itou86.bookmarket.dao.BookMapper;
import com.itou86.bookmarket.domain.Books;

import java.util.List;

/**
 * <p>书籍管理实现类</p>
 *
 * @author : Itou86
 * @version : 1.1.0
 * @date : 2021-06-18 19:10
 **/
public class BookServiceImpl implements BookService {

    //组合DAO层
    private BookMapper bookMapper;

    //set方法注入
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    /**
     * 查询全部书籍记录
     *
     * @return 所有的书籍记录
     */
    public List<Books> selectAllBook() {
        return bookMapper.selectAllBook();
    }

    /**
     * 根据书籍ID查询书籍记录
     *
     * @param id 书籍ID
     * @return 根据书籍ID查询到的书籍
     */
    public Books selectBookById(Integer id) {
        return bookMapper.selectBookById(id);
    }

    /**
     * 根据书籍名称查询书籍记录
     *
     * @param bookName 书籍名称
     * @return 根据书籍名称查询到的书籍
     */
    public List<Books> selectBookByBookName(String bookName) {
        return bookMapper.selectBookByBookName(bookName);
    }

    /**
     * 增加书籍记录
     *
     * @param books 书籍实例
     */
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    /**
     * 根据书籍ID删除书籍记录
     *
     * @param id 书籍ID
     */
    public int deleteBookById(Integer id) {
        return bookMapper.deleteBookById(id);
    }

    /**
     * 更新书籍记录
     *
     * @param books 书籍记录
     */
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }
}
