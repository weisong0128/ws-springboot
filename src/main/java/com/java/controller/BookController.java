package com.java.controller;

import com.java.pojo.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * @description: 测试返回json数据
 * @author: ws
 * @time: 2020/4/21 14:54
 */
@Controller
//@RestController可代替@Controller + @ResponseBody
public class BookController {

    @GetMapping("/book")
    @ResponseBody
    public Book book() {
        Book book = new Book();
        book.setAuthor("罗贯中");
        book.setName("三国演义");
        book.setPrice(30f);
        book.setPublicationDate(new Date());
        return book;
    }
}
