package com.mybatisplus.mybatisx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mybatisplus.mybatisx.mapper")
public class MybatisxApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisxApplication.class, args);
    }

}
