package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 1.spring cloud config client项目；
 * 2.从cloud config server服务器获取配置文件；
 * @author wangx
 *
 */
@SpringBootApplication
@RestController
public class SpringCloudConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigClientApplication.class, args);
	}
	/**
	 * 验证从cloud config server获取本项目的配置文件config-client-dev.properties
	 */
	@Value("${date}")
    private String date;
	
	@Value("${name}")
    private String name;
	
    @RequestMapping(value = "/hi")
    public String hi(){
        return "config-client从config-server读取配置文件："+date+name;
    }
}
