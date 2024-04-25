package com.diwuweidu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.diwuweidu.Mapper")
@SpringBootApplication
public class DiwuweiduApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiwuweiduApplication.class, args);
    }

}
