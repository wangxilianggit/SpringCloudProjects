package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 1.可手动刷新的配置客户端；
 * 2.在需要刷新的类上注解refreshscope；
 * 3.要使用手动刷新功能，需要启用actuator；
 * 4.具体操作：localhost://{客户端的地址+端口}/refresh
 * @author wangx
 *
 */
@SpringBootApplication
@RestController
@RefreshScope
public class SpringCloudConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigClientApplication.class, args);
	}
	/**
	 * 验证从cloud config server获取本项目的配置文件config-client-dev.properties
	 */
	@Value("${refresh}")
    private String refresh;
	
    @RequestMapping(value = "/hi")
    public String hi(){
    	System.out.println(refresh);
        return "config-client从config-server读取配置文件："+refresh;
    }
}
