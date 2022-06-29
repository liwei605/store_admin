package com.cqu.store_admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
@MapperScan("com.cqu.store_admin.mapper")
public class StoreAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreAdminApplication.class, args);
    }

}
