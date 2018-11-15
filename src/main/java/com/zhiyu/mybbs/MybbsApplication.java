package com.zhiyu.mybbs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhiyu
 */
@SpringBootApplication
@MapperScan("com.zhiyu.mybbs.backservices.dao.*")
public class MybbsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybbsApplication.class, args);
    }
}
