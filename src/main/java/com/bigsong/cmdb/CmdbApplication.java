package com.bigsong.cmdb;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;




@SpringBootApplication
@EnableSwagger2
@EnableAutoConfiguration
@MapperScan("com.bigsong.cmdb.mapper")
public class CmdbApplication {

    public static void main(String[] args) {
        SpringApplication.run(CmdbApplication.class, args);
    }
}
