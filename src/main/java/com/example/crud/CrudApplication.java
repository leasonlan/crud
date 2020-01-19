package com.example.crud;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.crud.mapper")
public class CrudApplication {
	protected static final Logger logger = LoggerFactory.getLogger(CrudApplication.class);
	public static void main(String[] args) {
		logger.info("SpringBoot开始加载");
		SpringApplication.run(CrudApplication.class, args);
		logger.info("SpringBoot加载完毕");
	}

}
