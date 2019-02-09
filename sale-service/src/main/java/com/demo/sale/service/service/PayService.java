package com.demo.sale.service.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("pay-service")
public interface PayService {

	@RequestMapping(method = RequestMethod.GET, value = "/doPay")
	double doPay();
}
