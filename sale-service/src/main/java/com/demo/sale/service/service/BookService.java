package com.demo.sale.service.service;

import com.demo.sale.service.model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@FeignClient("book-service")
public interface BookService {
	
	@RequestMapping(method = RequestMethod.GET, value = "/getBook/{id}")
	Book getBook(@PathVariable("id") Integer id);


}
