package com.example.online_re;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.online_re.mapper")
@SpringBootApplication
public class OnlineReApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineReApplication.class, args);
    }

}
