package com.demo.pay.service.servive;

import com.demo.pay.service.model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * PayBookService
 * 支付服务调用订单服务
 * @author 10905 2019/2/9
 * @version 1.0
 */
@FeignClient("book-service")
public interface PayBookService {

    @RequestMapping(method = RequestMethod.GET, value = "/getBook/{id}")
    Book getBook(@PathVariable("id") Integer id);
}
