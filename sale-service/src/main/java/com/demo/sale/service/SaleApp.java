package com.demo.sale.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class SaleApp {

    public static void main(String[] args) {
        SpringApplication.run(SaleApp.class, args);
        System.out.println("sale模块8082: http://localhost:8082/sale/3");
    }

}

