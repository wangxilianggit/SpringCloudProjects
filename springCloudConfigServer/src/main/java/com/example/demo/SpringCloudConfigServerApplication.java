package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
/**
 * 1.spring cloud config server项目
 * 2.该服务器连接git，获取配置文件;
 * 3.也可以配置本机文件路径，集中存放配置文件；
 * @author wangx
 *
 */
@SpringBootApplication
public class SpringCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServerApplication.class, args);
	}
}
