package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 1.此应用作为路由模块；
 * 2.负责把指定路径的访问路由到指定的服务
 * 3.增加过滤功能
 * @author wangxiliang
 *
 */
@SpringBootApplication
public class SpringCloudZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudZuulApplication.class, args);
	}
}
