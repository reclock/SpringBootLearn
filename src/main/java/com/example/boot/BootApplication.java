package com.example.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@MapperScan("com.example.boot.testmabatis.mapper")
public class BootApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =  SpringApplication.run(BootApplication.class, args);
    }

}
