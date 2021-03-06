package com.itou86.bookmarket.controller;

import com.itou86.bookmarket.domain.Books;
import com.itou86.bookmarket.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * <p>书籍控制器</p>
 *
 * @author : Itou86
 * @version : 1.1.0
 * @date : 2021-06-19 16:18
 **/
@Controller
@RequestMapping("/book")
public class BookController {

    //注入service层
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    //返回全部书籍
    @RequestMapping("/allBook")
    public String list(Model model) {
        List<Books> list = bookService.selectAllBook();
        model.addAttribute("list", list);
        return "allBook";
    }

    //跳转到新增书籍页面
    @RequestMapping("/toAddBook")
    public String toAddBook() {
        return "addBook";
    }

    //新增书籍
    @RequestMapping("/addBook")
    public String addBook(Books books) {
        bookService.addBook(books);
        return "redirect:/book/allBook"; //重定向到请求
    }

    //跳转到修改书籍界面
    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(Model model, int id) {
        Books books = bookService.selectBookById(id);
        model.addAttribute("book",books );
        return "updateBook";
    }

    //修改书籍
    @RequestMapping("/updateBook")
    public String updateBook(Model model, Books book) {
        bookService.updateBook(book);
        Books books = bookService.selectBookById(book.getId());
        model.addAttribute("books", books);
        return "redirect:/book/allBook"; //重定向到请求
    }

    //删除书籍
    @RequestMapping("/deleteBook")
    public String deleteBook(int id) {
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }

    //根据书籍名字返回书籍
    @RequestMapping("/selectBookByBookName")
    public String selectBookByBookName(Model model, String bookName) {
        List<Books> list = bookService.selectBookByBookName(bookName);
        model.addAttribute("list", list);
        return "allBook";
    }

}
