package com.demo.pay.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class PayApp {

    public static void main(String[] args) {
        SpringApplication.run(PayApp.class, args);
        System.out.println("支付模块8081: http://localhost:8081/doPay/68.8");
        System.out.println("到跟踪服务器监控面板搜索服务,如下拉框选择: http://localhost:9411/zipkin/");
    }

}

