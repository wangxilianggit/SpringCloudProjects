package com.example.demo.conf;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Configuration;
/**
 * 1.启用EurekaClient；
 * 2.启用FeignClients，服务消费
 * 3.启用熔断器；
 * 4.启用熔断器仪表盘；
 * @author wangx
 *
 */
@Configuration
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix
@EnableHystrixDashboard
public class SpringCloudConfig {

}
