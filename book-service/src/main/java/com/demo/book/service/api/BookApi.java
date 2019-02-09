package com.demo.book.service.api;

import com.demo.book.service.model.Book;
import org.springframework.web.bind.annotation.*;

/**
 * BookApi
 *
 * @author 10905 2019/2/9
 * @version 1.0
 */
@RestController
public class BookApi {
    /**
     * 浏览器测试
     */
//    @RequestMapping(value = "/getBook/{id}", method = RequestMethod.GET)
//    public String getBook(@PathVariable("id") Integer id) {
//        Book book = new Book(id, "java-spring cloud", "张晓祥");
//        System.out.println("进入了book服务----" + book);
//        return book.toString();
//
//    }


    /**
     * 客户端调用
     * @param id
     * @return
     */
    @RequestMapping(value = "/getBook/{id}", method = RequestMethod.GET)
    public Book getBook(@PathVariable("id") Integer id) {
        Book book = new Book(id, "java-spring cloud",5.5, "张晓祥");
        System.out.println("进入了book服务----" + book);
        return book;

    }
}
