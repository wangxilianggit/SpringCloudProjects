package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 1.创建spring-cloud Eureka server；
 * 2.eureka是一个服务注册和发现模块。
 * @author wangxiliang
 *
 */
@SpringBootApplication
public class SpringCloudEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaServerApplication.class, args);
	}
}
