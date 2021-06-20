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
 * @version : 1.0.0
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

}
