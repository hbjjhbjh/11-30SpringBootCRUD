package com.jdbc.sspringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jdbc.sspringboot.dao")
public class StartOS {
    public static void main(String[] args) {
        SpringApplication.run(StartOS.class,args);
    }
}
