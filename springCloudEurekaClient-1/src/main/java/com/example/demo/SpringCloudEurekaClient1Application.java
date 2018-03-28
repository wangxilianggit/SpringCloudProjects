package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 1.erueka client
 * 2.当client向server注册时，它会提供一些元数据，例如主机和端口，URL，主页等。
 * 3.Eureka server 从每个client实例接收心跳消息。 如果心跳超时，则通常将该实例从注册server中删除。
 */
@SpringBootApplication
public class SpringCloudEurekaClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaClient1Application.class, args);
	}
}
