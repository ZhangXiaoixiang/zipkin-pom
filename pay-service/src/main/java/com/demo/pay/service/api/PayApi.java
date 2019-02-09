package com.demo.pay.service.api;

import com.demo.pay.service.servive.PayBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

/**
 * PayApi
 *
 * @author 10905 2019/2/9
 * @version 1.0
 */
@RestController
@Configuration
@EnableFeignClients
public class PayApi {
    /**
     * 浏览器访问
     */
//   @RequestMapping(method = RequestMethod.GET, value = "/doPay/{money}")
//    public String doPay(@PathVariable("money") Double money) {
//        System.out.println("进入了支付模块---：" + money+"元");
//        return "支付金额: "+money.toString()+"元";
//    }

    /**
     * 提供给其他服务,返回销售的书籍的支付总金额
     */
    @Autowired
    private PayBookService payBookService;

    @RequestMapping(method = RequestMethod.GET, value = "/doPay")
    public Double doPay() {
        System.out.println("模拟订单book销售了3本书,id为3(查询到的书籍价格为5.5)");
        Double money = payBookService.getBook(3).getPrice() * 3;
        System.out.println("进入了pay服务---金额：" + money);
        return money;
    }
}
