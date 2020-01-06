package com.mage.crmboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mage.crmboot.mapper")
public class CrmBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrmBootApplication.class, args);
    }

}
