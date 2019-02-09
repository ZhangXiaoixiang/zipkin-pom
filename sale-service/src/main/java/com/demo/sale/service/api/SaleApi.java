package com.demo.sale.service.api;

import com.demo.sale.service.model.Book;
import com.demo.sale.service.service.BookService;
import com.demo.sale.service.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * SaleApi
 *
 * @author 10905 2019/2/9
 * @version 1.0
 */
@RestController
@EnableFeignClients
@Configuration
public class SaleApi {
    @Autowired
    private BookService bookService;

    @Autowired
    private PayService payService;

    @RequestMapping(method = RequestMethod.GET, value = "/sale/{id}")
    public String sale(@PathVariable("id") Integer id) {
        System.out.println("销售模块处理销售");
        // 查找书本
        Book book = bookService.getBook(id);

        // 进行支付
        double pay = payService.doPay();
        System.out.println("销售成功，书ID: " + book.getId() + "  书名:  " + book.getName() + ", 作者："
                + book.getAuthor() + "  单价(为了简单,价格都一样):" + book.getPrice() + "元" + "  销售总金额:" + pay + "元");

        return "销售成功，书ID: " + book.getId() + "  书名:  " + book.getName() + ", 作者："
                + book.getAuthor() + "  单价(为了简单,价格都一样):" + book.getPrice() + "元" + "  销售总金额:" + pay + "元";
    }
}
