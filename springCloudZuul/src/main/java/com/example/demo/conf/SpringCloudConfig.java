package com.example.demo.conf;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @author wangxiliang
 *
 */
@Configuration
@EnableEurekaClient
@EnableZuulProxy
public class SpringCloudConfig {

}
