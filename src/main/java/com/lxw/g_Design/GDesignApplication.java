package com.lxw.g_Design;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@MapperScan(basePackages="com.lxw.g_Design.mapper")
public class GDesignApplication {

	public static void main(String[] args) {
		SpringApplication.run(GDesignApplication.class, args);
	}

}
