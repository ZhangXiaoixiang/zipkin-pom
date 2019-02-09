package com.demo.book.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BookApp {

    public static void main(String[] args) {
        SpringApplication.run(BookApp.class, args);
        System.out.println("book模块8080:  http://localhost:8080/getBook/123");
    }

}

